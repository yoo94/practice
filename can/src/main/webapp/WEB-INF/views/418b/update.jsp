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
 	<input type="hidden" name="id" value="${cdto.id }"><p/>
 	이름<input type="text" name="name" value="${cdto.name }"><p/>
	제목<input type="text" name="title" value="${cdto.title }"><p/>
	내용<textarea rows="30" cols="30" name="content" >${cdto.content }</textarea>
	<button>수정하기</button>
 </form>
</body>
</html>