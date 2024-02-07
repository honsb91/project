package kr.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hospital.mapper.NoticeMapper;
import kr.hospital.model.NoticeVO;

@Service
public class NoticeServiceImpl implements NoticeService{
	
	@Autowired
	NoticeMapper noticeMapper;

	// 공지사항 등록
	@Override
	public void registr(NoticeVO notice) throws Exception {
		
		noticeMapper.registr(notice);
	}

	// 공지사항 목록
	@Override
	public List<NoticeVO> getList() {
		
		return noticeMapper.getList();
	}
	
	// 공지사항 조회
	@Override
	public NoticeVO getPage(int notice_no) {
		return noticeMapper.getPage(notice_no);
	}

	// 공지사항 수정
	@Override
	public int modify(NoticeVO notice) {
		return noticeMapper.modify(notice);
	}
	

}
