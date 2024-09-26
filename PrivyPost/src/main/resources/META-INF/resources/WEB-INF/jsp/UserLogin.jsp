<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login | </title>
<link href="/Style/style.css" rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Chakra+Petch:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&family=Dosis:wght@200..800&family=Edu+AU+VIC+WA+NT+Guides:wght@400..700&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap" rel="stylesheet">
</head>
<body>
	<div class="s_Header">
		<h1>Privy Post</h1>
		<a href="privypost" class="s_header_login">Home</a>
		<a href="login" class="s_header_signup">Login</a>
		<a href="signup" class="s_header_signup">Sign Up</a>
	</div>
	<form action="" method="post" class="s_form">
		<h1>User Login</h1><br/><br/>
		<input type="email" class="s_input" name="puserid" placeholder="Email/UserId" style="height: 55px;" required><br/><br/>
    	<input type="password" class="s_input" name="ppass" placeholder="Password" style="height: 55px;" required><br/><br/><br/>
		<button class="s_button"  type="submit">Login</button>
	</form>
</body>
</html>