<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form method="post" action="update_ok">
  	<input type="hidden" name="id" value="${cdto.id }">
    <input type="text" name="name" value="${cdto.name }"><p/>
    <input type="text" name="title" value="${cdto.title }"><p/>
	<textarea cols="30" rows="50" name="content">${cdto.content }</textarea> 
	<button>수정하기</button>   
  </form>
</body>
</html>