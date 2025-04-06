<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page import="java.util.ArrayList" %> 
<%@ page import="java.util.List" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 리스트</title>
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
	<h1>SSAFY 영화 관리</h1>
	<h2>지금까지 등록한 영화 수 : ${mCnt}</h2>

	<table>
		<tr>
			<th scope="col">번호</th>
			<th scope="col">제목</th>			
			<th scope="col">감독</th>			
			<th scope="col">개요</th>
			<th scope="col">상영시간</th>
		</tr>

		<!-- movieList가 존재할 때만 출력 -->
		<c:choose>
			<c:when test="${not empty sessionScope.movieList}">
				<c:forEach var="movie" items="${sessionScope.movieList}" varStatus="status">
					<tr>
						<td><c:out value="${movie.id}"/></td>
						<td><c:out value="${movie.title}"/></td>
						<td><c:out value="${movie.director}"/></td>
						<td><c:out value="${movie.genre}"/></td>
						<td><c:out value="${movie.runningtime}"/>분</td>
					</tr>
				</c:forEach>
			</c:when>
			<c:otherwise>
				<tr>
					<td colspan="5">등록된 영화가 없습니다.</td>
				</tr>
			</c:otherwise>
		</c:choose>
	</table>
	<a href="/db_ws_10_2/main?action=registForm">추가등록</a>
</body>
</html>