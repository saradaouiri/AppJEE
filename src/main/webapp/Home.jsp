

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <ul class="nav nav-pills nav-justified mb-3" id="ex1" role="tablist">
    <li class="nav-item" role="presentation">
	<a href="Jouer.jsp"> Jouer</a>
	</li>
</ul>
  <ul class="nav nav-pills nav-justified mb-3" id="ex1" role="tablist">
    <li class="nav-item" role="presentation">
	<a href="GameServ?reinit"> Réinitialiser</a>
	</li>
</ul>
  <ul class="nav nav-pills nav-justified mb-3" id="ex1" role="tablist">
    <li class="nav-item" role="presentation">
	<a href="UserServlet?action=list"> Meilleurs score</a>
	</li>
</ul>
  
     
  <ul class="nav nav-pills nav-justified mb-3" id="ex1" role="tablist">
    <li class="nav-item" role="presentation">
	<a href="DeconnectServlet"> Se deconnecter</a>
	</li>
</ul>

   


</body>
</html>