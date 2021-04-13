<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function userid_dupcheck(form)
{
	   var chk=new XMLHttpRequest();
	   chk.open("get","userid_dupcheck?userid="+form.userid.value);
	   chk.send();
	   chk.onreadystatechange=function()
	   {
		   if(chk.readyState==4) // 동작이 완료되면
		   {
		         if(chk.responseText==0) // 레코드가 없다 => 사용가능
		         {
		        	 alert("아이디 사용가능"); 
		        	 document.getElementById("uid").innerText="아이디 중복 확인 완료 ";
		        	 document.getElementById("uid").style.color="blue";
		        	 form.userid_chk.value=1;//히든값 변경
		         }
		         else
		         {
		        	 alert("아이디 사용 불가능")
		        	 document.getElementById("uid").innerText="아이디 중복 확인 x ";
		        	 document.getElementById("uid").style.color="red";
		        	 form.userid_chk.value=0;
		         }
		   }	   
	   }
}
function pwdchk()
{
	if(document.getElementById('pwd1').value==document.getElementById('pwd2').value){
        document.getElementById('pw').innerHTML='비밀번호가 일치합니다.'
        document.getElementById('pw').style.color='blue';
        document.getElementById('pw_chk').value=1;
    }
    else{
        document.getElementById('pw').innerHTML='비밀번호가 일치하지 않습니다.';
        document.getElementById('pw').style.color='red';
        document.getElementById('pw_chk').value=0;
    }
	   
}
function check(my) //my는 form태그를 가리킨다
{
	if(my.userid_chk.value==0)
	{
		alert("아이디 중복확인이 필요합니다.");
		return false;
	}else if(my.pw_chk.value==0){
		alert("비밀번호가 일치하지 않습니다.");
		return false;
	}
	else
		return true;
	}
</script>
</head>
<body>
<form method="post" action="sub_ok" onsubmit="return check(this)"><p/>
<input type="hidden" name="userid_chk" value="0" >
<input type="hidden" name="pw_chk" id="pw_chk"  value="0" >
 아이디<input type="text" name="userid" required>
 <span id="uid"></span><p/>
<input type="button" value="중복확인" onclick="userid_dupcheck(this.form)"><p/>

 비밀번호<input type="password" name="pwd" id="pwd1" onchange="pwdchk()" required ><p/>
 비밀번호확인<input type="password" id="pwd2" onchange="pwdchk()"><p/>
 <span id="pw"></span><p/>
 
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