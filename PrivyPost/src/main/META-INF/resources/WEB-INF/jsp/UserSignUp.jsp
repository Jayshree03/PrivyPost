<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up | Privy Post</title>
</head>
<body>
	<form method="post" modelAttribute="user">
			<a href="" >Patient</a> 
			<a href="" >Doctor</a> 
			<a href="" >Hospital</a>
			<a href="" >LabTech</a>
			<a href="" >Pharmacy</a>
		
			<input type="text" name="pname" placeholder="Name" style="height: 55px;" required>
		
			<input type="email" name="puserid" placeholder="Email/UserId" style="height: 55px;" required>
		
			<input type="text" name="pmob" placeholder="Phone No." style="height: 55px;" required>
		
			<input type="text" name="padd" placeholder="Address" style="height: 55px;" required>
		
			<input type="text" name="page" placeholder="Age" style="height: 55px;" required>
		
			<input type="text" name="pgender" placeholder="Gender" style="height: 55px;" required>
		
			<input type="password" name="ppass" placeholder="Password" style="height: 55px;" required>
		
			<input type="password" name="pcpass" placeholder="Confirm Password" style="height: 55px;" required>
		
			<button  type="submit">SignUp</button>
		</div>
	</form>
</body>
</html>