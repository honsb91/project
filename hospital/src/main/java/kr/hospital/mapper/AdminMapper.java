package kr.hospital.mapper;

import kr.hospital.model.AdminVO;

public interface AdminMapper {
	
	// 관리자 로그인
	public AdminVO adminLogin(AdminVO admin);

}
