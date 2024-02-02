package kr.hospital.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class NoticeVO {
	
	// 공지사항 번호
	private int notice_no;
	
	// 공지사항 제목
	private String notice_title;
	
	// 공지사항 내용
	private String notice_content;
	
	// 공지사항 등록일
	private Date notice_regdate;
	
	// 공지사항 작성자
	private String notice_writer;

}
