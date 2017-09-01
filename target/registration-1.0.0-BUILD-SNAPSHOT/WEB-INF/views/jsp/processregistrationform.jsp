<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Information</title>
</head>
<body>
<form action="./findAll.html" method="GET" name="displayRegistrationInfo">
<h3>Firstname:--->${registration.firstName}</h3>
<h3>Lastname:--->${registration.lastName}</h3>
<h3>Address:--->${registration.address}</h3>
<h3>Phone:--->${registration.phone}</h3>
<h3>Email:--->${registration.emailId}</h3><br>
<input type=submit name="submit" value="lookup"/>
</form>
</body>
</html>