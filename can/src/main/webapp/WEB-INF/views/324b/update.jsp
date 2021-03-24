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
<input type="hidden" name="id" value="${cdto.id}">
 <input type="text" name="name" id="name" value="${cdto.name }"><p/>
 <input type="text" name="title" id="title" value="${cdto.title }"><p/>
 <textarea cols="4" row="4" name="content" >${cdto.content }</textarea><p/>
 <button>입력</button>
 </form>
</body>
</html>