<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
  <span>${productVO.name }</span>
  <span>${productVO.price }</span>
  
  <%
  	int i=1;
  	int j =2 ;
  	int sum = i+j;
  	out.print(sum);
  %>
  
</body>
</html>

