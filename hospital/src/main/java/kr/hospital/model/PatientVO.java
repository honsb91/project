package kr.hospital.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class PatientVO {
	
	// 환자 id
	private String patient_id;
	// 환자 pw
	private String patient_pw;
	// 환자 이름
	private String patient_name;
	// 환자 전화번호
	private String patient_phone;
	// 환자 생일
	private String patient_birth;
	// 환자 우편주소
	private String patient_addr1;
	// 환자 기본주소
	private String patient_addr2;
	// 환자 상세주소
	private String patient_addr3;
	// 환자 성별
	private String patient_gender;
	// 환자 혈액형
	private String patient_blood;
}
