package kr.hospital.service;

import kr.hospital.model.AdminVO;

public interface AdminService {

	// 관리자 로그인
	public AdminVO adminLogin(AdminVO admin) throws Exception; 
}
