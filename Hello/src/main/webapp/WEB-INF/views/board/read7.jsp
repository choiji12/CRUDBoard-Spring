<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>
<html>
	<h3><b><center>게시물 열람</center></b></h3>
	<div>
		<label> 제 목 </label>
		<input type ="text" value="${boardVO.title}" readonly="readonly">
		<br>
	</div>

	<div>
		<lable> 내용 </lable>
		<textarea rows="5" readonly="readonly">
			${boardVO.content }
		</textarea>
		<br>
	</div>
	
	<div>
		<lable> 글쓴이 </lable>
		<input type ="text" value="${boardVO.writer}" readonly="readonly">
		<br>
	</div>
	
	<a href="/board/modify?bno=${boardVO.bno}">
		<button> 수 정</button>
	</a>
	
	<a href="/board/remove?bno=${boardVO.bno}">
		<button> 삭 제</button>
	</a>
	
	<a href="/board/listAll">
		<button> 목록보기</button>
	</a>
</html>
<%@include file="../include/footer.jsp"%>
