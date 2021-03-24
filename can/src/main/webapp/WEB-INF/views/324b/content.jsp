<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table width="1000" height="700">
		<tr>
			<td>이름</td>
			<td>${cdto.name}</td>
		</tr>
		<tr>
			<td>제목</td>
			<td>${cdto.title}</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>${cdto.content}</td>
		</tr>
		<tr>
			<td>작성날짜</td>
			<td>${cdto.writeday}</td>
		</tr>
		<tr>
			<td>조회수</td>
			<td>${cdto.readnum}</td>
		</tr>
		<tr>
			<td><a href="<%=request.getContextPath()%>/324b/list">list가기</a></td>
			<td><a href="<%=request.getContextPath()%>/324b/delete?id=${cdto.id}">해당 content삭제</a></td>
			<td><a href="<%=request.getContextPath()%>/324b/update?id=${cdto.id}">해당 content수정</a></td>
		</tr>
	</table>

</body>
</html>