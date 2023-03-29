package com.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.bo.User;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AuthentificationServlet")
public class AuthentificationServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctxt = getServletContext()  ;
		PrintWriter out = response.getWriter() ;
		String login = request.getParameter("login") ;
		String password = request.getParameter("password") ;
		ArrayList<User> users = (ArrayList<User>) ctxt.getAttribute("listusers") ;
		if (users!=null && !users.isEmpty() ) {
		User foundUser = null ;
		for (User it:users) {
			if(it.getLogin().equals(login) && it.getPassword().equals(password)) {
				foundUser = it ;
				break ;
			}
		}
			if (foundUser != null ) {
				request.getSession().setAttribute("connecteduser",foundUser) ;
				request.getRequestDispatcher("Home.jsp").forward(request,response) ;
					
			}
			else {
				out.print("login ou mot de passe est incorrect");
			}
			
			
		}
	    else {
			out.print("login ou mot de passe est incorrect ");
			
		
		
		
		
		
	}

	}
}
