<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	HOME !
</h1>

<%
	int a = 10;
	int b = 10;
	int sum = a + b;
	
	out.print("a의 값" + a + "<br>");
	out.print("b의 값" + b + "<br>");
	out.print("sum의 값" + sum + "<br>");

%>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
