<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display All Job Openings</title>
</head>
<body>
<table BORDER="8" bgcolor="#FAEBD7" cellspacing="10" cellpadding="15" align="center">
<tr>
	<th>JobId</th>
	<th>JobRole</th>
	<th>JobDescription</th>
	<th>JobStatus</th>
	<th>JobDuration</th>
	<th>JobLocation</th>
	<th>companyName</th>
</tr>
	<c:forEach var="job" items="${jobList}">
		<tr>
		   <td>${job.jobId}</td><td>${job.jobRole}</td>
		   <td>${job.jobDescription}</td><td>${job.jobStatus}</td>
		   <td>${job.jobDuration}</td><td>${job.jobLocation}</td>
		   <td>${job.companyName}</td><td> <a href="applyJobForm">Apply</a></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>