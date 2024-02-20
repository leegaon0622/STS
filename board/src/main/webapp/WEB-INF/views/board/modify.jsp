<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<html>
<body>
<%@include file="../include/header.jsp" %>
<h1> 게시물 수정 </h1>
	
	<form role="form" method="post">
		<input type="hidden" name="bno" value="${boardVO.bno}"> 
		<div>
			<label>제목</label>
			<input type="text" name="title" value="${boardVO.title}">
		</div>
		<div>
			<textarea type="text" name="content" rows="3">
				${boardVO.content}
			</textarea>
		</div>
		<div>
			<input type="text" name="writer" value="${boardVO.writer}" 
			readonly="readonly">
		</div>
	</form>
	<button type="submit" class="modify">저장</button>
	<button type="submit" class="listall">목록보기</button>
		
	<script>
		$(document).ready(function(){
			var formObj = $("form[role='form']");
			console.log(formObj);
			$(".modify").on("click", function(){
				formObj.attr("action", "/board/modify");
				formObj.attr("method", "post");
				formObj.submit();
			});
			$(".listall").on("click", function(){
				self.location="/board/listAll";
			});
			
		});
	
	</script>


<%@include file="../include/footer.jsp" %>
</body>
</html>
