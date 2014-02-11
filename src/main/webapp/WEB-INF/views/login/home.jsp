<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="resources/CSS/style.css" />
</head>
<body>


<div class="container">
	<section id="content">
		<form action="loginHomePost.html" method="post">
			<h1>Login Form</h1>
			<div>
				<input type="text" placeholder="Login ID" name="userId" />
			</div>
			<div>
				<input type="password" placeholder="Password" name="password" />
			</div>
			<div>
				<input type="submit" value="Log in" />
				<a href="#">Lost your password?</a>
			</div>
		</form><!-- form -->
		
	</section><!-- content -->
</div><!-- container -->
</body>
</html>
