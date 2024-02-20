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
	int gop = 1;
	for(int i=2; i<=9; i++){
		for(int j=2; j<=9; j++){
			out.print(i+ "*" + j + "=" + gop + "<br>");
		}
		out.print("<br>");
	}
%>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>