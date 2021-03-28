package kr.co.can.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
public String list(Model model) {
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

//------------------------------------------0325----------------------------------
@RequestMapping("/325b/write")
public String write2() {
	return "/325b/write";
}
@RequestMapping("/325b/write_ok")
public String write_ok2(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok2(cdto);
	return "redirect:/325b/list";
}
@RequestMapping("/325b/list")
public String list2(Model model) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto> list=cdao.list2();
	model.addAttribute("list",list);
	return "/325b/list";
}
@RequestMapping("/325b/readnum")
public String readnum(Model model, HttpServletRequest request) {
	String id = request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum(id);
	return "redirect:/325b/content?id"+id;
	
}
@RequestMapping("/325b/content")
public String content2(Model model, HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content2(id);
	model.addAttribute("cdto",cdto);
	return "/325b/content";
}
@RequestMapping("/325b/update")
public String update2(Model model, HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.update(id);
	model.addAttribute("cdto",cdto);
	return "/325b/update";
}
@RequestMapping("/325b/update_ok")
public String update_ok2(CanDto cdto, HttpServletRequest request) {
	
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok2(cdto);
	return "redirect:/325b/content?id="+cdto.getId();
}
@RequestMapping("/325b/delete")
public String delete2(Model model, HttpServletRequest request) {
	String id = request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete2(id);
	
	return "redirect:/325b/list";
}
//------------------------------------------0326----------------------------------
@RequestMapping("/326b/write")
public String write3() {
	return "/326b/write";
}
@RequestMapping("326b/write_ok")
public String write_ok3(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok3(cdto);
	return "redirect:/326b/list";
}
@RequestMapping("326b/list")
public String list3(Model model) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto>list=cdao.list3();
	model.addAttribute("list",list);
	return "/326b/list";
	
}
@RequestMapping("326b/readnum")
public String readnum3(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum3(id);
	return "redirect:/326b/content?id="+id;
}

@RequestMapping("326b/content")
public String content3(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content3(id);
	model.addAttribute("cdto",cdto);
	return "/326b/content";
	}
@RequestMapping("326b/update")
public String update3(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.update3(id);
	model.addAttribute("cdto",cdto);
	return "/326b/update";
}
@RequestMapping("326b/update_ok")
public String update_ok3(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok3(cdto);
	return "redirect:/326b/content?id="+cdto.getId();
}
@RequestMapping("326b/delete")
public String delete3(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete3(id);
	return "redirect:/326b/list";
}

//------------------------------------------0327----------------------------------
@RequestMapping("/327b/write")
public String write4() {
	return "/327b/write";
}
@RequestMapping("327b/writeok")
public String write_ok4(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok4(cdto);
	return "redirect:/327b/list";
}
@RequestMapping("327b/list")
public String list4(Model model){
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto>list=cdao.list4();
	model.addAttribute("list",list);
	return "/327b/list";
}
@RequestMapping("327b/readnum")
public String readnum4(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum3(id);
	return "redirect:/327b/content?id="+id;
}

@RequestMapping("327b/content")
public String content4(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content3(id);
	model.addAttribute("cdto",cdto);
	return "/327b/content";
	}

@RequestMapping("327b/update")
public String update4(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content3(id);
	model.addAttribute("cdto",cdto);
	return "/327b/update";
	}
@RequestMapping("327b/update_ok")
public String update_ok4(HttpServletRequest request,CanDto cdto) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok4(cdto);
	return "redirect:/327b/content?id="+id;
}
@RequestMapping("327b/delete")
public String delete4(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete4(id);
	return "redirect:/327b/list";
}














}
