<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose | Privy Post</title>
<link href="/Style/style.css" rel="stylesheet">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Chakra+Petch:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&family=Dosis:wght@200..800&family=Edu+AU+VIC+WA+NT+Guides:wght@400..700&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap" rel="stylesheet">
</head>
<body>
	<div class="s_Header">
		<h1>Privy Post</h1>
		<a href="inbox" class="s_header_inbox">Inbox</a>
		<a href="compose" class="s_header_signup">Compose</a>
		<a href="sent" class="s_header_signup">Sent</a>
	</div>
	<h1 class="main_feature">Compose</h1>
	<form action="" method="post" class="s_compose_form">
			<h3>To:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input class="s_compose_input" type="email" name="puserid" required></h3>
			<br/>
			<h3>From:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input class="s_compose_input" type="email" name="pname"required></h3>
			<br/>
			<h3>Subject:&nbsp;&nbsp; <input class="s_compose_input" type="text" name="subject" required></h3>
			<br/>
			<h3>Email Content: <br/><textarea rows=70 cols=60 name="content" required></textarea></h3><br/>
			<h3>Add Attachments: <br/><input class="s_compose_input" type="file" name="attachments"></h3><br/><br/>
			<button class="s_button"  type="submit">Send</button><br/><br/>
	</form>
</body>
</html>