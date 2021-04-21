<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#first{
 width:1000px;
 height:40px;
 margin:auto;
}
#first #left{
 float:left;
}

#first #right{
float:right;
}
</style>
</head>
<body>
 <div id="first">
  <div id="left"><a href="mypage">나의 페이지</a></div>
  <div id="right">
  <!-- 로그인 안햇을때 -->
  <c:if test="${userid == null }">
  <a href="<%=request.getContextPath() %>/member1/login">로그인1</a><p/>
  <a href="<%=request.getContextPath() %>/member2/login">로그인2</a><p/>
  <a href="<%=request.getContextPath() %>/member3/login">로그인3</a><p/>
  <a href="<%=request.getContextPath() %>/member4/login">로그인4</a><p/>
  <a href="<%=request.getContextPath() %>/member5/login">로그인5</a><p/>
  <a href="<%=request.getContextPath() %>/member6/login">로그인6</a><p/>
  로그인을 해주셔야 게시판 이용이 가능합니다.
  </c:if>
    <!-- 로그인 햇을때 -->
  <c:if test="${userid != null }">  
  안녕하세요 ${name } 님! <a href="<%=request.getContextPath() %>/logout">//로그아웃</a><p/>
 <a href="<%=request.getContextPath()%>/324b/list">324blist</a><p/>
 <a href="<%=request.getContextPath()%>/325b/list">325blist</a><p/>
 <a href="<%=request.getContextPath()%>/326b/list">326blist</a><p/>
 <a href="<%=request.getContextPath()%>/327b/list">327blist</a><p/>
 <a href="<%=request.getContextPath()%>/403b/list">403blist</a><p/>
 <a href="<%=request.getContextPath()%>/404b/list">404blist</a><p/>
 <a href="<%=request.getContextPath()%>/405b/list">405blist</a><p/>
 <a href="<%=request.getContextPath()%>/406b/list">406blist</a><p/>
 <a href="<%=request.getContextPath()%>/407b/list">407blist</a><p/>
 <a href="<%=request.getContextPath()%>/408b/list">408blist</a><p/>
 <a href="<%=request.getContextPath()%>/409b/list">409blist</a><p/>
 <a href="<%=request.getContextPath()%>/410b/list">410blist</a><p/>
 <a href="<%=request.getContextPath()%>/411b/list">411blist</a><p/>
 <a href="<%=request.getContextPath()%>/415b/list">415blist</a><p/>
 <a href="<%=request.getContextPath()%>/416b/list">416blist</a><p/>
 <a href="<%=request.getContextPath()%>/417b/list">417blist</a><p/>
 <a href="<%=request.getContextPath()%>/418b/list">418blist</a><p/>
 <a href="<%=request.getContextPath()%>/419b/list">419blist</a><p/>
 <a href="<%=request.getContextPath()%>/421b/list">421blist</a><p/>
  
  </c:if>
   </div>
  
  
 </div>

</body>
</html>