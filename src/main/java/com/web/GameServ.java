package com.web;



import java.io.IOException;




import java.io.IOException;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.bo.User;
@WebServlet("/GameServ")
public class GameServ extends HttpServlet {
	Map<Integer, Integer> dic = new HashMap<>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession s = request.getSession() ;
		User user = (User) s.getAttribute("connecteduser") ;
		

		StringBuffer sb = new StringBuffer() ;
		
		if (user != null ) {
			
			
			if (request.getParameter("reinit") != null ) {
				s.setAttribute("nbrLancees",0) ;
				s.setAttribute("score",0);
				dic.clear() ;
				sb.append("Vous pouvez jouer !!") ;
				request.getRequestDispatcher("Jouer.jsp").forward(request, response);

				return;	
			}
			
			ServletContext cntx = getServletContext() ;
			PrintWriter out = response.getWriter() ;
			int nbrLancees = 0 ;
			int  score = 0 ;
			
			int numdeLancee = Integer.parseInt(request.getParameter("numdeLancee"));

			//if (s.getAttribute("nbrLancees") != null) {
				//nbrLancees = (Integer) s.getAttribute("nbrLancees");

			//}
			
			
			
			
			if (nbrLancees <2)  {
				
				Random rd = new Random();
			    int resultat = (int) 1 + rd.nextInt(6);
				

				if ( numdeLancee!=1 && numdeLancee!=2 && numdeLancee!=3 ) {
					s.setAttribute("nbrLancees", nbrLancees - 1);
					sb.append("vous dever lancer un de compris en 1 et 3") ;
					request.setAttribute("msg", sb.toString());
					
					
				  } else if (!(dic.containsKey(numdeLancee))){
							dic.put(numdeLancee, resultat);
						    sb.append("resultat = " + resultat) ;
						    sb.append(dic.size()) ;
						    request.setAttribute("msg", sb.toString());
							
								 
						     } 
						else {
						
						
							sb.append("vous avez lancer le meme des deux foix ") ;
							request.setAttribute("score",  -1);
							request.setAttribute("msg", sb.toString());
							request.setAttribute("BestScore", user.getBestScore());
							dic.clear();
				        	nbrLancees=0;
							request.getRequestDispatcher("Score.jsp").forward(request, response);
							
							//return;
					     } }
					    
	                    if (dic.containsKey(2)) {
					    int r2 = dic.get(2);
					    
	                         if (r2 == 6 || r2 == 1 ) {
	                    dic.clear() ;
	                	
	                	
	                	sb.append("vous aver obtenue le resultat du des 2 soit 6 soit 1") ;
	 					request.setAttribute("msg", sb.toString());
						s.setAttribute("score", 0);
						request.getRequestDispatcher("Score.jsp").forward(request, response);

						//return ;
						
						
	                 } }
					 
	
					
				
			
		      if (dic.size()==3) {
		    	  int r1 = dic.get(1);
		          int r2 = dic.get(2);
		          int r3 = dic.get(3);
		          dic.clear() ;

				
						if (  r1 < r2 && r2 < r3 ) {
							
							
							score = r1 * r2 * r3;
							
							
                         }
						else if (  r1 > r2 && r2 > r3 ) {
							
							score = r1+r2+r3;
							
						}
					
					
						 sb.append(" | Votre score est de " +score); 
					      s.setAttribute("score", score);
					      if (score > user.getBestScore()) {
						       user.setBestScore(score);}
					      
					      request.setAttribute("msg", sb.toString());
					      request.setAttribute("score", score);
						  request.setAttribute("bestScore", user.getBestScore());
						  
					      request.getRequestDispatcher("Score.jsp").forward(request, response);
				          }
			
				
			  
		      
		      s.setAttribute("nbrLancees", nbrLancees + 1);	  
			  request.setAttribute("msg", sb.toString());
				request.getRequestDispatcher("Jouer.jsp").forward(request, response);
				return;
			

		 }else {

			request.getRequestDispatcher("LoginForm.jsp").forward(request, response);
			return;

		}
	}

}
