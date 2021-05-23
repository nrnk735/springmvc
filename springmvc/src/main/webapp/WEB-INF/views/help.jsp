<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.time.LocalDateTime" %>
<%@page import="java.time.format.DateTimeFormatter" %>

<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>

 <%
     /*String name=(String)request.getAttribute("name");
     Integer roll=(Integer)request.getAttribute("rollnumber");
     LocalDateTime time=(LocalDateTime)request.getAttribute("time");*/
     
     
 %>
 <h1>My name is ${name}</h1>
 <h2>My roll number is ${rollnumber}</h2>
 <h2>Current date and time is ${time}</h2>
 
 
 <%-- <h1>My name is <%= name %></h1>  --%>
 <h2>My roll number is <%-- <%= roll %> --%> </h2>
 <h2>Current date and time is <%-- <%= time %> --%></h2>
 
 <c:forEach var="item" items="${marks}">
    <%-- <h1>${item}</h1> --%>
    <h1><c:out value="${item}"></c:out></h1>
 </c:forEach>
</body>
</html>