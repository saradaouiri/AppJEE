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

<a href="Home.jsp" >Home</a>
<a href="GameServ?reinit"> Reinitialiser</a>

	
		
		<form action="GameServ" method="post">
		<label for="nombre">Numero du de :</label>
		<input type="number" id="nombre" name="numdeLancee" required>
		<input type="submit" value="lancer">
		
	
 <%
   
   out.print( request.getAttribute("msg"));
   
   %>

</form>
	





</body>
</html>