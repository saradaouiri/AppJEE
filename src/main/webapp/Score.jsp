<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>
<body>


<body>
<a href="Home.jsp" >Home</a>
<a href="Jouer.jsp"> Rejouer</a>
    <h1> Partie termine ! </h1>
    
    
          <h2>Votre Score: <%= request.getAttribute("score") %></h2>
    
    
    
    <h3>Votre Best Score: <%= request.getAttribute("bestScore") %></h3>
    
    	
 <%
   
   out.print( request.getAttribute("msg"));
   
   %>

</body>
</html>
    