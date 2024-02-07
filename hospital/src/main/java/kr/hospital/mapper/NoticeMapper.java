package kr.hospital.mapper;

import java.util.List;

import kr.hospital.model.NoticeVO;

public interface NoticeMapper {
	
	// 공지사항 등록
	public void registr(NoticeVO notice);

	// 공지사항 목록
	public List<NoticeVO> getList();
	
	// 공지사항 조회
	public NoticeVO getPage(int notice_no);
	
	// 공지사항 수정
	public int modify(NoticeVO notice);
	
}
