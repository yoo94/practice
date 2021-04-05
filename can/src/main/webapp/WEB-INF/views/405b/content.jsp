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
    <td>날짜</td>
    <td>${cdto.writeday }</td>
  </tr>
  <tr>
    <td>조회수</td>
    <td>${cdto.readnum }</td>
  </tr>
  <tr>
    <td><a href="<%=request.getContextPath()%>/405b/list"> 목록</a></td>
    <td><a href="<%=request.getContextPath()%>/405b/update">수정</a></td>
    <td><a href="<%=request.getContextPath()%>/405b/delete">삭제</a></td>
  </tr>
 </table>
</body>
</html>