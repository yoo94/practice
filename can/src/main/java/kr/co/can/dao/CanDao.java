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
	
	
	
	
	
	
	
}
