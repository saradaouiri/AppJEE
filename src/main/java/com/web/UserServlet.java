package com.web;

import java.io.IOException;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.bo.User;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	
   

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctxt = getServletContext() ;
        PrintWriter out = response.getWriter() ;
		
		String action = request.getParameter("action");
		
		if (action != null && action.equals("list")) {
			ArrayList<User> list = (ArrayList<User>) ctxt.getAttribute("listusers") ;
			if (list != null) {
				request.setAttribute("listusers",list) ;
				request.getRequestDispatcher("listUsers.jsp").forward(request, response); 
				return ;
			}
		} else if (action != null && action.equals("create")) {
			
			String nom =request.getParameter("nom") ;
			String prenom = request.getParameter("prenom") ;
			String login = request.getParameter("login") ;
			String password = request.getParameter("password") ;
			
			User user = new User() ;
			user.setNom(nom) ;
			user.setPrenom(prenom) ;
			user.setLogin(login);
			user.setPassword(password);
			
			
			ArrayList<User> list ;
			
			if (ctxt.getAttribute("listusers") == null) {
				list = new ArrayList<>() ;
				ctxt.setAttribute("listusers",list) ;
				
			} 
			else {
				list = (ArrayList<User>) ctxt.getAttribute("listusers") ;
				
				
			}
			list.add(user) ;
		} 

}
}	