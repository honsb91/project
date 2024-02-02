package kr.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hospital.mapper.AdminMapper;
import kr.hospital.model.AdminVO;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	AdminMapper adminMapper;

	// 관리자 로그인
	@Override
	public AdminVO adminLogin(AdminVO admin) throws Exception {
		return adminMapper.adminLogin(admin);
	}
	
	

}
