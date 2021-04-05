package kr.co.can.dao;

import java.util.ArrayList;

import kr.co.can.dto.CanDto;

public interface CanDao {
 
	public void write_ok(CanDto cdto);
	public ArrayList<CanDto>list();
	public void readnum(String id);
	public CanDto content(String id);
	public void delete(String id);
	public CanDto update(String id);
	public void update_ok(CanDto cdto);
	//============0325==================
	public void write_ok2(CanDto cdto);
	public ArrayList<CanDto>list2();
	public void readnum2(String id);
	public CanDto content2(String id);
	public CanDto update2(String id);
	public void update_ok2(CanDto cdto);
	public void delete2(String id);
	//============0326==================
	public void write_ok3(CanDto cdto);
	public ArrayList<CanDto>list3();
	public void readnum3(String id);
	public CanDto content3(String id);
	public CanDto update3(String id);
	public void update_ok3(CanDto cdto);
	public void delete3(String id);
	//============0327==================
	public void write_ok4(CanDto cdto);
	public ArrayList<CanDto>list4();
	public CanDto content4(String id);
	public void readnum4(String id);
	public CanDto update4(String id);
	public void update_ok4(CanDto cdto);
	public void delete4(String id);
	//============0403==================
	public void write_ok5(CanDto cdto);
	public ArrayList<CanDto>list5();
	public void readnum5(String id);
	public CanDto content5(String id);
	public void delete5(String id);
	public void update_ok5(CanDto cdto);
	//============0403==================
	public void write_ok6(CanDto cdto);
	public ArrayList<CanDto>list6();
	public void readnum6(String id);
	public CanDto content6(String id);
	public void delete6(String id);
	public void update_ok6(CanDto cdto);
	//============0403==================
	public void write_ok7(CanDto cdto);
	public ArrayList<CanDto>list7();
	public CanDto readnum7(String id);
	public CanDto content7(String id);
	
	
	
	
	
}
