<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<h1>Ratan sir is good in teaching</h1>
	<% 
	 int a=(Integer)request.getAttribute("num1");
	int b=(Integer)request.getAttribute("num2");
	%>
	<h2> Addition of two numbers : <%=(a+b)%> </h2>
</body>
</html>