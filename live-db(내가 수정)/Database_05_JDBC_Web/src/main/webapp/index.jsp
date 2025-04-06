<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSAFY 게시판</title>
</head>
<body>
	<!-- 메인화면을 구현하세요 -->
	<h1>간단한 게시판 실습</h1>

	<a href="board?act=writeform">게시글 등록</a>
	<a href="board?act=list">게시글 목록</a>
	
	<!-- 절대경로? -->
	<ul>
		<li><a href="<%=request.getContextPath()%>/board?act=list">목록2</a></li>
		<li><a href="${pageContext.request.contextPath}/board?act=list">목록3</a></li>
		<li><a href="${pageContext.request.contextPath}/board?act=list">목록3</a></li>
		<li><a href="${root}/board?act=list">목록3</a></li>
		<!--  root라는 변수에 저장을 해두고 써도 ㄱㅊ(변수를 헤더나 푸터에 넣어두면 불러올 수 있으니) -->
	</ul>

</body>
</html>