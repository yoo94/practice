package kr.co.can.dao;

import kr.co.can.dto.MemberDto;

public interface MemberDao {
	//회원가입
	public void sub_ok(MemberDto mdto);
	//아이디 중복확인
	public int get_userid_chk(String userid);
	//============login==================
	public MemberDto login_ok(MemberDto mdto);
	public MemberDto login_ok2(MemberDto mdto);
	public MemberDto login_ok3(MemberDto mdto);
	
}
