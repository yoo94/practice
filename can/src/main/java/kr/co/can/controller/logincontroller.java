package kr.co.can.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.can.dao.CanDao;
import kr.co.can.dto.MemberDto;

@Controller
public class logincontroller {
@Autowired
public SqlSession sqlSession;

@RequestMapping("/login")
public String login(Model model, HttpServletRequest request) {
	model.addAttribute("chk",request.getParameter("chk"));
	return "/login";
}
@RequestMapping("login_ok")
public String login_ok(MemberDto mdto, HttpSession session) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	MemberDto mdto2=cdao.login_ok(mdto);
	if(mdto2==null){
		return "redirect:/login?chk=1";
	}else {
		session.setAttribute("userid", mdto2.getUserid());
		session.setAttribute("name", mdto2.getName());
		return "redirect:/index";
	}
	
}
@RequestMapping("logout")
public String logout(HttpSession session) {
	session.invalidate();
	return "redirect:/index";
}
@RequestMapping("mypage")
public String mypage(HttpSession session) {
	if(session.getAttribute("userid")==null) {
		return "redirect:/login?chk=2";
		
	}else {
		return "/mypage";
	}
}
@RequestMapping("sub")
public String sub() {
	return "sub";
}
@RequestMapping("sub_ok")
public String sub_ok(MemberDto mdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.sub_ok(mdto);
	return "redirect:/login";
}

}
