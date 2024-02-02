package kr.hospital.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AdminVO {
	
	// 관리자 id
	private String admin_id;
	
	// 관리자 pw
	private String admin_pw;
	
	// 관리자 이름
	private String admin_name;
	
	// 관리자 이메일
	private String admin_email;
	
	// 관리자 전화번호
	private String admin_phone;

}
