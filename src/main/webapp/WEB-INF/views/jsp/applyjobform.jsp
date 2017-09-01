<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Job Form</title>
</head>
<body>
<form action="./successfullyAppliedForm.html" method="POST">
<table align="center">
			<tr>
			<td><h3>Job Application Form</h3></td>
			</tr>
			<tr>
				<td><label for="">Job ID</label></td>
				<td><input type="text" name="jobId" value="${jobId}"></td> 
			</tr>
			<tr>
				<td><label for="">Job Title</label></td>
				<td><input type="text" name="jobTitle" value="${jobRole}"></td>
			</tr>
			<tr>
				<td><label for="candidateName">Candidate Name</label></td>
				<td><input type="text" name="candidateName" id="candidateName"></td>
			</tr>
			<tr>
				<td><label for="candidatePhone">Candidate Phone</label></td>
				<td><input type="text" name="candidatePhone" id="candidatePhone"></td>
			</tr>
			<tr>
				<td><label for="candidateEmail">Candidate Email</label></td>
				<td><input type="text" name="candidateEmail" id="candidateEmail"></td>
			</tr>
			<tr>
				<td><input type=submit name="submit" value="submit"/></td>
			</tr>
</table>		
</form>		
</body>
</html>