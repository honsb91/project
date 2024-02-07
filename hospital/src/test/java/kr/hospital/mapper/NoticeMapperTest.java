package kr.hospital.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.hospital.model.NoticeVO;
import kr.hospital.service.NoticeService;
import kr.hospital.service.NoticeServiceTest;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class NoticeMapperTest {

	private static final Logger log = LoggerFactory.getLogger(NoticeServiceTest.class);

	@Autowired
	private NoticeMapper noticeMapper;

	@Autowired
	private NoticeService noticeService;

	// 공지사항 등록 테스트
//	@Test
//	public void notice() throws Exception{
//		
//		NoticeVO notice = new NoticeVO();
//		
//		Date date = new Date();
//		
//		notice.setNotice_no(0);
//		notice.setNotice_title("오늘의 뉴스");
//		notice.setNotice_content("오늘의 뉴스소식입니다.");
//		notice.setNotice_writer("honsb");
//		notice.setNotice_regdate(date);
//		
//		
//		noticeMapper.registr(notice);
//	}

	/* 공지사항 목록 테스트 */
	/*
	 * @Test public void testGetList() {
	 * 
	 * List list = noticeMapper.getList();
	 * 
	 * 
	 * 일반적 for문 for(int i = 0; i < list.size();i++) { log.info("" + list.get(i)); }
	 * 
	 * foreach문(향상된 for문) for(Object a : list) { log.info("" + a); }
	 * 
	 * 
	 * foreach문 & 람다식 list.forEach(notice -> log.info("" + notice));
	 * 
	 * }
	 */
	
	// 공지사항 조회 테스트
//	@Test
//	public void testGetPage() {
//		
//		int notice_no = 31;
//		
//		System.out.println("" + noticeMapper.getPage(notice_no));
//	}
	
	// 게시판 수정 테스트
	@Test
	public void testModify() {
		
		NoticeVO notice = new NoticeVO();
		
		notice.setNotice_no(31);
		notice.setNotice_title("수정매퍼테스트");
		notice.setNotice_content("매퍼테스트 내용수정");
		
		int result = noticeMapper.modify(notice);
		System.out.println("result : " + result);
		
	}
}
