<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <table>
  <tr>
   	<td>이름</td>
   	<td>${cdto.name }</td>
  </tr>
  <tr>
   	<td>제목</td>
   	<td>${cdto.title }</td>
  </tr>
  <tr>
   	<td>내용</td>
   	<td>${cdto.content }</td>
  </tr>
  <tr>
   	<td>조회수</td>
   	<td>${cdto.readnum }</td>
  </tr>
  <tr>
   	<td>작성일</td>
   	<td>${cdto.writeday }</td>
  </tr>
  <tr>
   	<td><a href="<%=request.getContextPath()%>/411b/list">목록</a></td>
   	<td><a href="<%=request.getContextPath()%>/411b/update?id=${cdto.id }">수정ㄱ</a></td>
   	<td><a href="<%=request.getContextPath()%>/411b/delete?id=${cdto.id }">삭제 ㄱ</a></td>
  </tr>
  
  </table>
</body>
</html>