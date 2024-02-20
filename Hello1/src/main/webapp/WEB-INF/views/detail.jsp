<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=UTF-8" %>

<%@ page import = "java.util.*" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<span>${productVO.name }</span>
<span>${productVO.price }</span>

<%
	int i = 1;
	int j = 2;
	int sum = i+j;
	out.print(sum);
%>
</body>
</html>