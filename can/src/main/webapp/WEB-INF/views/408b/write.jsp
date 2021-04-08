<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="write_ok">
	  이름<input type="text" name="name"><p/>
	  제목<input type="text" name="title"><p/>
	  내용<textarea rows="30" cols="30" name="content" placeholder="입력해"></textarea><p/>
	  <input type="submit" value="입력"><p/>
	</form>
</body>
</html>