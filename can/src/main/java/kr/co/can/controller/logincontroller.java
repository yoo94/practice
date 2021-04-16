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
@RequestMapping("/member1/userid_dupcheck")
public void userid(HttpServletRequest request,PrintWriter out ) {
	String userid=request.getParameter("userid");
	MemberDao mdao=sqlSession.getMapper(MemberDao.class);
	int n=mdao.get_userid_chk(userid);
	out.print(n);//-> 자바스크립트의 responsetext로 간다.
}
//==============member1================
@RequestMapping("/member1/login")
public String login(Model model, HttpServletRequest request) {
	model.addAttribute("chk",request.getParameter("chk"));
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
@RequestMapping("/member1/logout")
public String logout(HttpSession session) {
	session.invalidate();
	return "redirect:/index";
}
//==============member2================
@RequestMapping("/member2/login")
public String login() {
	return "/member2/login";
}
}
