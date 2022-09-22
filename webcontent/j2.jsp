<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
hello
<%out.println(application.getAttribute("name")); %>
<%= config.getInitParameter("username") %>
<%= session.getAttribute("uname") %>
</body>
</html>