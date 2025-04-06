<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="com.ssafy.ws.step2.dto.Movie" %>   
<%@ page import="java.util.Arrays" %>  
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 등록 결과</title>
<style>
	table { border-collapse : collapse; }
	th, td{
		width: 200px;
		height: 30px;
		text-align: center;
		border: 1px solid black;
	}
</style>
</head>
<body>
	<h1>영화 등록 결과</h1>

	<h2>지금까지 등록한 영화 수 : ${mCnt}</h2>

	<h3>등록된 영화 정보</h3>

	<table>
		<tr>
			<th scope="col">항목</th>
			<th scope="col">내용</th>
		</tr>
		<tr>
			<td>제목</td>
			<td>${regiMovie.title}</td>
		</tr>
		<tr>
			<td>감독</td>
			<td>${regiMovie.director}</td>
		</tr>
		<tr>
			<td>장르</td>
			<td>${regiMovie.genre}</td>
		</tr>
		<tr>
			<td>상영시간</td>
			<td>${regiMovie.runningtime}</td>
		</tr>
	</table>
	<a href="/db_ws_10_2/main?action=registForm">추가등록</a>
	<a href="/db_ws_10_2/main?action=list">영화목록</a>
</body>
</html>