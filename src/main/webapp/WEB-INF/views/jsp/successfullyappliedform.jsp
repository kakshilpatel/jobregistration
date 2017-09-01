<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Successfully Applied</title>
</head>
<body>
<h3>Job-ID:--->${sessionScope.appList.jobId}</h3>
<h3>Job-Title:--->${sessionScope.appList.jobTitle}</h3>
<h3>Candidate-Name:--->${sessionScope.appList.candidateName}</h3>
<h3>Candidate-Phone:--->${sessionScope.appList.candidatePhone}</h3>
<h3>Candidate-Email:--->${sessionScope.appList.candidateEmail}</h3>
</body>
</html>