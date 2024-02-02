package kr.hospital.service;

import kr.hospital.model.NoticeVO;

public interface NoticeService {

	// 공지사항 등록
	public void registr(NoticeVO notice) throws Exception;
	
}
