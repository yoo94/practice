<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <table  width="1000" height="700">
 <tr><td><a href="<%=request.getContextPath()%>/324b/write">글쓰기</a></td></tr>
  <tr>
   <td>이름</td>
   <td>제목</td>
   <td>작성일</td>
  </tr>
<c:forEach items="${list}" var="cdto">
    <tr>
   <td>${cdto.name}</td>
   <td><a href="<%=request.getContextPath()%>/324b/readnum?id=${cdto.id}">${cdto.title}</a></td>
   <td>${cdto.writeday}</td>
  </tr>
 </c:forEach>
 </table>
</body>
</html>