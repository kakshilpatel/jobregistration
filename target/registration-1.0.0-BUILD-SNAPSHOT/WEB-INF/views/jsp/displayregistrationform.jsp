<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<form action="./processRegistrationInformation.html" method="POST" name="writeRegistrationInfoForm" enctype="multipart/form-data">
<table align="center">
			<tr>
			<td><h3>Registration Form</h3></td>
			</tr>
			<tr>
				<td><label for="firstName">First Name</label></td>
				<td><input type="text" name="firstName" id="firstName"></td> 
			</tr>
			<tr>
				<td><label for="lastName">Last Name</label></td>
				<td><input type="text" name="lastName" id="lastName"></td>
			</tr>
			<tr>
				<td><label for="address">Address</label></td>
				<td><input type="text" name="address" id="address"></td>
			</tr>
			<tr>
				<td><label for="phone">Phone</label></td>
				<td><input type="text" name="phone" id="phone"></td>
			</tr>
			<tr>
				<td><label for="emailId">Email</label></td>
				<td><input type="text" name="emailId" id="emailId"></td>
			</tr>
			<tr>
				<td><input type=submit name="submit" value="submit"/>&nbsp;
				<td><input type=reset name="reset" value="reset"/>				
				</td>
			</tr>
		</table>
</form>
</body>
</html>