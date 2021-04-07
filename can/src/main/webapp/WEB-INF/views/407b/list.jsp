<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
 <tr>
   <td>제목</td>
   <td>조회수</td>
   <td>작성일</td>
 </tr>
<c:forEach items="${list }" var="cdto">
 <tr>
   <td><a href="<%=request.getContextPath()%>/407b/readnum?id=${cdto.id}">${cdto.title}</a></td>
   <td>${cdto.readnum}</td>
   <td>${cdto.writeday}</td>
 </tr>
</c:forEach> 
</table>
</body>
</html>