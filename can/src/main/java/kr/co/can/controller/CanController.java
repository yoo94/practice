package kr.co.can.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysql.fabric.xmlrpc.base.Array;

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




}


