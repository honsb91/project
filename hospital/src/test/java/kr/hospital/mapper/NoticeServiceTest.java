package kr.hospital.mapper;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.hospital.model.NoticeVO;
import kr.hospital.service.NoticeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class NoticeServiceTest {

	@Autowired
	private NoticeService noticeService;
	
//	@Test
//	public void testRegistr() throws Exception {
//		
//		NoticeVO nvo = new NoticeVO();
//		Date date = new Date();
//		
//		nvo.setNotice_no(2);
//		nvo.setNotice_title("오늘사러갑니다.");
//		nvo.setNotice_content("매곡동에 사러갑니다.");
//		nvo.setNotice_regdate(date);
//		nvo.setNotice_writer("honsb");
//		
//		noticeService.registr(nvo);
//		
//	}
	
	// 게시판 조회 테스트
	@Test
	public void testGetPage() {
		
		int notice_no = 31;
		
		System.out.println("" + noticeService.getPage(notice_no));
	}
}
