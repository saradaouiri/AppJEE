<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
<!-- Pills navs -->
<ul class="nav nav-pills nav-justified mb-3" id="ex1" role="tablist">
  
  <li class="nav-item" role="presentation">
    <a class="nav-link" id="tab-register" data-mdb-toggle="pill" href="LoginForm.jsp" role="tab"
      aria-controls="pills-register" aria-selected="false">j'ai deja un compte </a>
  </li>
</ul>
<!-- Pills navs -->

	 <form action="UserServlet" method="POST">
 
 <input type="hidden"  name="action" value="create">
		<label >Nom:</label> <input type="text"  name="nom"><br>
		<label >Prenom:</label> <input type="text"  name="nom"><br>
		<label >Login:</label> <input type="text"  name="login"><br>	
	    <label >Password:</label> <input type="password"  name="password"><br>
		<input type="submit" value="Envoyer">



	</form>
</body>
</html>