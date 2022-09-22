<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%! int a=0; %>
<% 

out.println("===="+a++);
%>
<%= a++ %>
<%
session.setAttribute("uname", "daksh");
application.setAttribute("name", "harshada");
RequestDispatcher rd= application.getRequestDispatcher("/j2");
rd.include(request, response);
%>
</body>
</html>