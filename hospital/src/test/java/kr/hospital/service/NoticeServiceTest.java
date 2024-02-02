package kr.hospital.service;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.hospital.model.NoticeVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class NoticeServiceTest {

	@Autowired
	private NoticeService noticeService;
	
	@Test
	public void registr() throws Exception{
		NoticeVO notice = new NoticeVO();
		Date date = new Date();
		
		notice.setNotice_no(1);
		notice.setNotice_title("서비스 테스트");
		notice.setNotice_content("이것마저 테스트를 해야한다.");
		notice.setNotice_regdate(date);
		notice.setNotice_writer("service Test");
		
		noticeService.registr(notice);
	}
}
