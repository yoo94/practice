package kr.co.can.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.can.dao.MemberDao;
import kr.co.can.dto.MemberDto;

@Controller
public class logincontroller {
@Autowired
public SqlSession sqlSession;

//회원가입
@RequestMapping("sub")
public String sub() {
	return "sub";
}
@RequestMapping("sub_ok")
public String sub_ok(MemberDto mdto) {
	MemberDao mdao=sqlSession.getMapper(MemberDao.class);
	mdao.sub_ok(mdto);
	return "redirect:/member1/login";
}
//mypage
@RequestMapping("mypage")
public String mypage(HttpSession session) {
	if(session.getAttribute("userid")==null) {
		return "redirect:/member1/login?chk=2";
		
	}else {
		return "/mypage";
	}
}
//유효성검사
@RequestMapping("/userid_dupcheck")
public void userid(HttpServletRequest request,PrintWriter out ) {
	String userid=request.getParameter("userid");
	MemberDao mdao=sqlSession.getMapper(MemberDao.class);
	int n=mdao.get_userid_chk(userid);
	out.print(n);//-> 자바스크립트의 responsetext로 간다.
}
//logout
@RequestMapping("logout")
public String logout(HttpSession session) {
	session.invalidate();
	return "redirect:/index";
}
//==============member1================
@RequestMapping("/member1/login")
public String login(Model model, HttpServletRequest request) {
	return "/member1/login";
}
@RequestMapping("/member1/login_ok")
public String login_ok(MemberDto mdto, HttpSession session) {
	MemberDao mdao=sqlSession.getMapper(MemberDao.class);
	MemberDto mdto2=mdao.login_ok(mdto);
	if(mdto2==null){
		return "redirect:/member1/login?chk=1";
	}else {
		session.setAttribute("userid", mdto2.getUserid());
		session.setAttribute("name", mdto2.getName());
		return "redirect:/index";
	}
}

//==============member2================
@RequestMapping("/member2/login")
public String login2() {
	return "/member2/login";
}
@RequestMapping("/member2/login_ok")
public String login_ok2(MemberDto mdto,HttpSession session) {
	MemberDao mdao=sqlSession.getMapper(MemberDao.class);
	MemberDto mdto2=mdao.login_ok2(mdto);
	if(mdto2==null){
		return "redirect:/member2/login?chk=1";
	}else {
		session.setAttribute("userid", mdto2.getUserid());
		session.setAttribute("name", mdto2.getName());
		return "redirect:/index";
	}
}
//==============member3================
@RequestMapping("/member3/login")
public String login3() {
	return "/member3/login";
}
@RequestMapping("/member3/login_ok")
public String login_ok3(MemberDto mdto,HttpSession session) {
	MemberDao mdao=sqlSession.getMapper(MemberDao.class);
	MemberDto mdto2=mdao.login_ok3(mdto);
	if(mdto2==null) {
		return "redirect:/member3/login";
	}else {
		session.setAttribute("userid", mdto2.getUserid());
		session.setAttribute("name", mdto2.getName());
		return "redirect:/index";
	}
}
//==============member4================
@RequestMapping("/member4/login")
public String login4() {
	return "/member4/login";
}
@RequestMapping("/member4/login_ok")
public String login_ok4(MemberDto mdto,HttpSession session) {
	MemberDao mdao=sqlSession.getMapper(MemberDao.class);
	MemberDto mdto2=mdao.login_ok4(mdto);
	if(mdto2==null) {
		return "redirect:/member4/login";
	}else {
		session.setAttribute("userid",mdto2.getUserid());
		session.setAttribute("name",mdto2.getName());
		return "redirect:/index";
	}

}
//==============member5================
@RequestMapping("/member5/login")
public String login5() {
	return "/member5/login";
}
@RequestMapping("/member5/login_ok")
public String login_ok5(MemberDto mdto,HttpSession session) {
	MemberDao mdao=sqlSession.getMapper(MemberDao.class);
	MemberDto mdto2=mdao.login_ok5(mdto);
	if(mdto2==null) {	
		return "redirect:/member5/login";
	}else {
		session.setAttribute("userid", mdto2.getUserid());
		session.setAttribute("name", mdto2.getName());		
		return "redirect:/index";
	}
	
}










}
