<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp |</title>
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
	<form action="patientSignUp" method="post" class="s_form">
			<h1>User Sign Up</h1>
			<input class="s_input" type="email" name="puserid" placeholder="Email/UserId" required><br/><br/>
			<input class="s_input" type="text" name="pname" placeholder="Name" required><br/><br/>
			<input class="s_input" type="text" name="pmob" placeholder="Phone No." required><br/><br/>
			<input class="s_input" type="password" name="ppass" placeholder="Password" required><br/><br/>
			<input class="s_input" type="password" name="pcpass" placeholder="Confirm Password" required><br/><br/><br/>
			<button class="s_button"  type="submit">Sign Up</button>
	</form>
</body>
</html>