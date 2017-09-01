<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Table</title>
</head>
<body>
 <table BORDER="8" bgcolor="#FAEBD7" cellspacing="10" cellpadding="15">
<tr>
	<th>FirstName</th>
	<th>LastName</th>
	<th>Address</th>
	<th>Phone</th>
	<th>Email</th>
</tr>
	<c:forEach var="reg" items="${regList}">
		<tr>
		   <td>${reg.firstName}</td><td>${reg.lastName}</td>
		   <td>${reg.address}</td><td>${reg.phone}</td>
		   <td>${reg.emailId}</td>
		</tr>
	</c:forEach>


</table>
</body>
</html>