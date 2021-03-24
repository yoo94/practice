package kr.co.can.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.can.dao.CanDao;
import kr.co.can.dto.CanDto;


@Controller
public class CanController {
@Autowired
public SqlSession sqlSession;
@RequestMapping("/")
public String home() {
	return "redirect:/index";
}
@RequestMapping("/index")
public String index() {
	return "/index";
}
@RequestMapping("/324b/write")
public String write() {
	return "/324b/write";
}
@RequestMapping("/324b/write_ok")
public String write_ok(CanDto cdto) {
	
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok(cdto);
	return "redirec:/324b/list";
}
@RequestMapping("/324b/list")
public String list(Model model,HttpServletRequest request) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto>list=cdao.list();
	model.addAttribute("list",list);	
	return "/324b/list";
}
@RequestMapping("/324b/readnum")
public String readnum(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum(id);
	return "redirect:/324b/content?id="+id;
}
@RequestMapping("/324b/content")
public String content(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content(id);
	model.addAttribute("cdto",cdto);
	return "/324b/content";
}
@RequestMapping("/324b/delete")
public String delete(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete(id);
	return "redirect:/324b/list";
}
@RequestMapping("/324b/update")
public String update(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content(id);
	model.addAttribute("cdto",cdto);
	return "/324b/update";
}
@RequestMapping("/324b/update_ok")
public String update_ok(HttpServletRequest request,CanDto cdto) {

	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok(cdto);
	return "redirect:/324b/content?id="+cdto.getId();
	
	
}















}
