package kr.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hospital.mapper.NoticeMapper;
import kr.hospital.model.NoticeVO;

@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	NoticeMapper noticeMapper;

	@Override
	public void registr(NoticeVO notice) throws Exception {
		
		noticeMapper.registr(notice);
	}

}
