<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp | </title>
</head>
<body>
	<form action="patientSignUp" method="post">
                            
                         		
                                <div class="col-12 col-sm-6">
                                    <input type="text" class="form-control bg-white border-0" name="pname" placeholder="Name" style="height: 55px;" required>
                                </div>
                                <div class="col-12 col-sm-6">
                                    <input type="email" class="form-control bg-white border-0" name="puserid" placeholder="Email/UserId" style="height: 55px;" required>
                                </div>
                                <div class="col-12 col-sm-6">
                                    <input type="text" class="form-control bg-white border-0" name="pmob" placeholder="Phone No." style="height: 55px;" required>
                                </div>
                                <div class="col-12 col-sm-6">
                                    <input type="text" class="form-control bg-white border-0" name="padd" placeholder="Address" style="height: 55px;" required>
                                </div>
                                <div class="col-12 col-sm-3">
                                    <input type="text" class="form-control bg-white border-0" name="page" placeholder="Age" style="height: 55px;" required>
                                </div>
                                <div class="col-12 col-sm-3">
                                    <input type="text" class="form-control bg-white border-0" name="pgender" placeholder="Gender" style="height: 55px;" required>
                                </div>
                                <div class="col-12 col-sm-12">
                                    <input type="password" class="form-control bg-white border-0" name="ppass" placeholder="Password" style="height: 55px;" required>
                                </div>
                                <div class="col-12 col-sm-12">
                                    <input type="password" class="form-control bg-white border-0" name="pcpass" placeholder="Confirm Password" style="height: 55px;" required>
                                </div>
                                <div class="col-12">
                                    <button class="btn btn-primary w-100 py-3" type="submit">Sign Up</button>
                                </div>
                            </div>
                        </form>
</body>
</html>