<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function pwdchk(){
	var pw = $("#pwd1").val();
	var pw2 = $("#pwd2").val();
	if(pw1 !=pw2){
		alert("비밀번호가 일치하지 않습니다.");
		return false;
	}else{
		alert("비밀번호가 일치합니다.");
		return true;
	}
}
</script>
</head>
<body>
<form method="post" action="sub_ok"><p/>
 아이디<input type="text" name="userid" required><p/>
 <a href="logchk">아이디 중복확인하기</a>
 비밀번호<input type="password" name="pwd" id="pwd1" required><p/>
 비밀번호확인<input type="password" id="pwd2" onchange="pwdc"><p/>
 이름<input type="text" name="name" required><p/>
 이메일<input type="text" name="email" required><p/>
 핸드폰번호<input type="text" name="phone" required><p/>
 주소<input type="text" name="juso" required><p/>
 성별<select name="sung">
  <option value="1">남성</option>
  <option value="2">여성</option>
 </select><p/>
 생일<input type="date" name="juso"><p/>
 <button>회원가입하기</button>
</form>
</body>
</html>