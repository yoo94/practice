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
//------------------------------------------0403----------------------------------
@RequestMapping("403b/write")
public String write5() {
	return "403b/write";
}
@RequestMapping("403b/write_ok")
public String write_ok5(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok5(cdto);
	return "redirect:403b/list";
}
@RequestMapping("403b/list")
public String list5(Model model) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto>list=cdao.list5();
	model.addAttribute("list5",list);
	return "403b/list";
}
@RequestMapping("403b/readnum")
public String readnum5(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum5(id);
	return "redirect:/403b/content?id="+id;
	}
@RequestMapping("403b/content")
public String content5(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content5(id);
	model.addAttribute("cdto",cdto);
	return "403b/content";
}
@RequestMapping("403b/delete")
public String delete5(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete5(id);
	return "redirect:/403b/list";
}
@RequestMapping("403b/update")
public String update5(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content5(id);
	model.addAttribute("cdto",cdto);
	return "403b/update";
}
@RequestMapping("403b/update_ok")
public String update_ok5(CanDto cdto,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok5(cdto);
	return "redirect:/403b/content?id="+id;
}
//------------------------------------------0404----------------------------------
@RequestMapping("404b/write")
public String write6() {
	return "404b/write";
}
@RequestMapping("404b/write_ok")
public String write_ok6(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok6(cdto);
	return "redirect:/404b/list";
}
@RequestMapping("404b/list")
public String list6(Model model) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto>list=cdao.list6();
	model.addAttribute("list",list);
	return "404b/list";		
}

@RequestMapping("404b/readnum")
public String readnum6(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum6(id);
	return "redirect:/404b/content?id="+id;
}

@RequestMapping("404b/content")
public String content6(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content6(id);
	model.addAttribute("cdto",cdto);
	return "404b/content";
}
@RequestMapping("404b/delete")
public String delete6(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete6(id);
	return "redirect:/404b/list";
}
@RequestMapping("404b/update")
public String update6(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content6(id);
	model.addAttribute("cdto",cdto);
	return "404b/update";
}
@RequestMapping("404b/update_ok")
public String update_ok6(CanDto cdto,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok6(cdto);
	return "redirect:/404b/content?id="+id;
}
//------------------------------------------0405----------------------------------
@RequestMapping("405b/write")
public String write7() {
	return "405b/write";
}
@RequestMapping("405b/write_ok")
public String write_ok7(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok7(cdto);
	return "redirect:/405b/list";
}
@RequestMapping("/405b/list")
public String list7(Model model) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto>list=cdao.list7();
	model.addAttribute("list",list);
	return "/405b/list";
}
@RequestMapping("/405b/readnum")
public String readnum7(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum7(id);
	return "redirect:/405b/content?id="+id;
}

@RequestMapping("/405b/content")
public String content7(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content7(id);
	model.addAttribute("cdto", cdto);
	return "/405b/content";
}
@RequestMapping("/405b/delete")
public String delete7(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete7(id);
	return "redirect:/405b/list";
}
@RequestMapping("/405b/update")
public String update7(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content7(id);
	model.addAttribute("cdto", cdto);
	return "/405b/update";
}
@RequestMapping("/405b/update_ok")
public String update_ok7(HttpServletRequest request,CanDto cdto) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok7(cdto);
	return "redirect:/405b/content?id="+id;
	
}
//------------------------------------------0406----------------------------------
@RequestMapping("/406b/write")
public String write8(){
	return "/406b/write";
}
@RequestMapping("/406b/write_ok")
public String write_ok8(CanDto cdto){
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok8(cdto);
	return "redirect:/406b/list";
}
@RequestMapping("/406b/list")
public String list8(Model model) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto>list=cdao.list8();
	model.addAttribute("list",list);
	return "/406b/list";
}
@RequestMapping("/406b/readnum")
public String readnum8(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum8(id);
	return "redirect:/406b/content?id="+id;
}
@RequestMapping("/406b/content")
public String content8(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content8(id);
	model.addAttribute("cdto",cdto);
	return "/406b/content";
}
@RequestMapping("/406b/delete")
public String delete8(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete8(id);
	return "redirect:/406b/list";
}
@RequestMapping("/406b/update")
public String update8(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content8(id);
	model.addAttribute("cdto",cdto);
	return "/406b/update";
}
@RequestMapping("/406b/update_ok")
public String update_ok8(CanDto cdto,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok8(cdto);
	return "redirect:/406b/content?id="+id;
}
//------------------------------------------0407----------------------------------
@RequestMapping("/407b/write")
public String write9() {
	return "/407b/write";
}
@RequestMapping("/407b/write_ok")
public String write_ok9(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok9(cdto);	
	return "redirect:/407b/list";
}
@RequestMapping("/407b/list")
public String list9(Model model) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto>list=cdao.list9();
	model.addAttribute("list",list);
	return "/407b/list";
}
@RequestMapping("/407b/readnum")
public String readnum9(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum9(id);
	return "redirect:/407b/content?id="+id;
}
@RequestMapping("/407b/content")
public String content9(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content9(id);
	model.addAttribute("cdto",cdto);
	return "/407b/content";
}
@RequestMapping("/407b/delete")
public String delete9(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete9(id);
	return "redirect:/407b/list";

}
@RequestMapping("/407b/update")
public String update9(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content9(id);
	model.addAttribute("cdto",cdto);
	return "/407b/update";
}
@RequestMapping("/407b/update_ok")
public String update_ok9(CanDto cdto,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok9(cdto);
	return "redirect:/407b/content?id="+id;
	
}
//------------------------------------------0408----------------------------------
@RequestMapping("/408b/write")
public String write10() {
	return "/408b/write";
}
@RequestMapping("408b/write_ok")
public String write_ok10(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok10(cdto);;
	return "redirect:/408b/list";
}
@RequestMapping("/408b/list")
public String list10(Model model) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto>list=cdao.list10();
	model.addAttribute("list",list);
	return "/408b/list";
}
@RequestMapping("/408b/readnum")
public String readnum10(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum10(id);
	return "redirect:/408b/content?id="+id;
}
@RequestMapping("/408b/content")
public String content10(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content10(id);
	model.addAttribute("cdto",cdto);
	return "/408b/content";
}
@RequestMapping("/408b/delete")
public String delete10(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete10(id);
	return "redirect:/408b/list";
}
@RequestMapping("/408b/update")
public String update10(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content10(id);
	model.addAttribute("cdto",cdto);
	return "/408b/update";
}
@RequestMapping("408b/update_ok")
public String update_ok10(CanDto cdto,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok10(cdto);
	return "redirect:/408b/content?id="+id;
}
//------------------------------------------0409----------------------------------
@RequestMapping("/409b/write")
public String write11() {
	return "/409b/write";
}
@RequestMapping("/409b/write_ok")
public String write_ok11(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok11(cdto);
	return "redirect:/409b/list";
}
@RequestMapping("/409b/list")
public String list11(Model model) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto>list=cdao.list11();
	model.addAttribute("list",list);
	return "/409b/list";
}
@RequestMapping("/409b/readnum")
public String readnum11(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum11(id);
	return "redirect:/409b/content?id="+id;
}
@RequestMapping("/409b/content")
public String content11(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content11(id);
	model.addAttribute("cdto",cdto);
	return "/409b/content";
}
@RequestMapping("/409b/delete")
public String delete11(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete10(id);
	return "redirect:/409b/list";
}
@RequestMapping("/409b/update")
public String update11(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content11(id);
	model.addAttribute("cdto",cdto);
	return "/409b/update";
}
@RequestMapping("/409b/update_ok")
public String update_ok11(CanDto cdto,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok11(cdto);
	return "redirect:/409b/content?id="+id;
	}
//------------------------------------------0410----------------------------------
@RequestMapping("/410b/write")
public String write12() {
	return "/410b/write";
}
@RequestMapping("/410b/write_ok")
public String write_ok12(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok12(cdto);
	return "redirect:/410b/list";
}
@RequestMapping("/410b/list")
public String list12(Model model) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto>list=cdao.list12();
	model.addAttribute("list",list);
	return "/410b/list";
}
@RequestMapping("/410b/readnum")
public String readnum12(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum12(id);
	return "redirect:/410b/content?id="+id;
}
@RequestMapping("/410b/content")
public String content12(Model model, HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content12(id);
	model.addAttribute("cdto",cdto);
	return "/410b/content";
}
@RequestMapping("/410b/delete")
public String delte12(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete12(id);
	return "redirect:/410b/list";
}
@RequestMapping("410b/update")
public String update12(Model model, HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content12(id);
	model.addAttribute("cdto",cdto);
	return "/410b/update";
}
@RequestMapping("/410b/update_ok")
public String update_ok12(HttpServletRequest request,CanDto cdto) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok12(cdto);
	return "redirect:/410b/content?id="+id;
}
//------------------------------------------0411----------------------------------
@RequestMapping("/411b/write")
public String write13() {
	return "/411b/write";
}
@RequestMapping("/411b/write_ok")
public String write_ok13(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok13(cdto);
	return "redirect:/411b/list";
}
@RequestMapping("/411b/list")
public String list13(Model model) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto>list=cdao.list13();
	model.addAttribute("list",list);
	return "/411b/list";
}
@RequestMapping("/411b/readnum")
public String readnum13(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum13(id);
	return "redirect:/411b/content?id="+id;
}
@RequestMapping("/411b/content")
public String content13(HttpServletRequest request,Model model) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content13(id);
	model.addAttribute("cdto",cdto);
	return "/411b/content";
}
@RequestMapping("/411b/delete")
public String delete13(HttpServletRequest request){
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete13(id);
	return "redirect:/411b/list";
	}
@RequestMapping("/411b/update")
public String update13(HttpServletRequest request,Model model) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content13(id);
	model.addAttribute("cdto",cdto);
	return "/411b/update";
}
@RequestMapping("/411b/update_ok")
public String update_ok13(CanDto cdto,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok13(cdto);
	return "redirect:/411b/content?id="+id;
	}
//------------------------------------------0415----------------------------------
@RequestMapping("/415b/write")
public String wirte14() {
	return "/415b/write";
}
@RequestMapping("/415b/write_ok")
public String wirte_ok14(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok14(cdto);
	return "redirect:/415b/list";
}
@RequestMapping("/415b/list")
public String list14(Model model) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto>list=cdao.list14();
	model.addAttribute("list",list);
	return "/415b/list";
}
@RequestMapping("/415b/readnum")
public String readnum14(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum14(id);
	return "redirect:/415b/content?id="+id;

}
@RequestMapping("/415b/content")
public String content14(HttpServletRequest request ,Model model) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content14(id);
	model.addAttribute("cdto",cdto);
	return "/415b/content";
}
@RequestMapping("/415b/update")
public String upadte14(HttpServletRequest request ,Model model) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content14(id);
	model.addAttribute("cdto",cdto);
	return "/415b/update";
}
@RequestMapping("/415b/update_ok")
public String update_ok14(CanDto cdto,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok14(cdto);
	return "redirect:/415b/content?id="+id;
}
@RequestMapping("/415b/delete")
public String delete14(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete14(id);
	return "redirect:/415b/list";
}
//------------------------------------------0416----------------------------------
@RequestMapping("/416b/write")
public String write15() {
	return "/416b/write";
}
@RequestMapping("/416b/write_ok")
public String write_ok15(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok15(cdto);
	return "redirect:/416b/list";
}
@RequestMapping("/416b/list")
public String list15(Model model) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto> list=cdao.list15();
	model.addAttribute("list",list);
	return "/416b/list";
}
@RequestMapping("/416b/readnum")
public String readnum15(HttpServletRequest request ) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum15(id);
	return "redirect:/416b/content?id="+id;
}
@RequestMapping("/416b/content")
public String content15(Model model,HttpServletRequest request ) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content15(id);
	model.addAttribute("cdto",cdto);
	return "/416b/content";
}
@RequestMapping("/416b/update")
public String update15(Model model,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content15(id);
	model.addAttribute("cdto",cdto);
	return "/416b/update";
}
@RequestMapping("/416b/update_ok")
public String update_ok15(CanDto cdto,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok15(cdto);
	return "redirect:/416b/content?id="+id;
}
@RequestMapping("/416b/delete")
public String delete15(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete15(id);
	return "redirect:/416b/list";
}
//------------------------------------------0417----------------------------------
@RequestMapping("/417b/write")
public String write16() {
	return "/417b/write";
}
@RequestMapping("/417b/write_ok")
public String write_ok16(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok16(cdto);
	return "redirect:/417b/list";
}
@RequestMapping("/417b/list")
public String list16(Model model) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto>list=cdao.list16();
	model.addAttribute("list",list);
	return "/417b/list";
}
@RequestMapping("/417b/readnum")
public String readnum16(HttpServletRequest request) {
	String id = request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum16(id);
	return "redirect:/417b/content?id="+id;
}
@RequestMapping("/417b/content")
public String content16(HttpServletRequest request,Model model) {
	String id = request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content16(id);
	model.addAttribute("cdto",cdto);
	return "/417b/content";
}
@RequestMapping("/417b/update")
public String update16(HttpServletRequest request,Model model) {
	String id = request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content16(id);
	model.addAttribute("cdto",cdto);
	return "/417b/update";
}
@RequestMapping("/417b/update_ok")
public String update_ok16(CanDto cdto,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok16(cdto);
	return "redirect:/417b/content?id="+id;
}
@RequestMapping("/417b/delete")
public String delete16(HttpServletRequest request) {
	String id = request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete16(id);
	return "redirect:/417b/list";
}
//------------------------------------------0418----------------------------------

@RequestMapping("/418b/write")
public String write17() {
	return "418b/write";
}
@RequestMapping("/418b/write_ok")
public String write_ok17(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok17(cdto);
	return "redirect:/418b/list";
}
@RequestMapping("/418b/list")
public String list17(Model model) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto>list=cdao.list17();
	model.addAttribute("list",list);
	return "/418b/list";
}
@RequestMapping("/418b/readnum")
public String readnum17(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.readnum17(id);
	return "redirect:/418b/content?id="+id;
}
@RequestMapping("/418b/content")
public String content(HttpServletRequest request,Model model) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content17(id);
	model.addAttribute("cdto",cdto);
	return "/418b/content";
}
@RequestMapping("/418/delete")
public String delete17(HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.delete17(id);
	return "redirect:/418b/list";
}
@RequestMapping("/418b/update")
public String update17(HttpServletRequest request,Model model) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	CanDto cdto=cdao.content17(id);
	model.addAttribute("cdto",cdto);
	return "/418b/update";
}
@RequestMapping("/418b/update_ok")
public String update_ok17(CanDto cdto,HttpServletRequest request) {
	String id=request.getParameter("id");
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.update_ok17(cdto);
	return "redirect:/418b/content?id="+id;
}
//------------------------------------------0419----------------------------------
@RequestMapping("/419b/write")
public String write18() {
	return "/419b/write";
}
@RequestMapping("/419b/write_ok")
public String write_ok18(CanDto cdto) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	cdao.write_ok18(cdto);
	return "redirect:/419b/list";
}
@RequestMapping("/419b/list")
public String list18(Model model) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	ArrayList<CanDto>list=cdao.list18();
	model.addAttribute("list",list);
	return "/419b/list";
}
@RequestMapping("/419b/readnum")
public String readnum18(HttpServletRequest request) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	String id=request.getParameter("id");
	cdao.readnum18(id);
	return "redirect:/419b/content?id="+id;
}
@RequestMapping("/419b/content")
public String content18(Model model,HttpServletRequest request) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	String id=request.getParameter("id");
	CanDto cdto=cdao.content18(id);
	model.addAttribute("cdto",cdto);
	return "/419b/content";
}
@RequestMapping("/419b/delete")
public String delete18(HttpServletRequest request) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	String id=request.getParameter("id");
	cdao.delete18(id);
	return "redirect:/419b/list";
}
@RequestMapping("/419b/update")
public String update18(Model model,HttpServletRequest request) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	String id=request.getParameter("id");
	CanDto cdto=cdao.content18(id);
	model.addAttribute("cdto",cdto);
	return "/419b/content";
}
@RequestMapping("/419b/update_ok")
public String update_ok18(CanDto cdto,HttpServletRequest request) {
	CanDao cdao=sqlSession.getMapper(CanDao.class);
	String id=request.getParameter("id");
	cdao.update_ok18(cdto);
	return "redirect:/419b/content?id="+id;
}









}
	
