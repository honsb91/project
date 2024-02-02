package kr.hospital.mapper;

import kr.hospital.model.PatientVO;

public interface PatientMapper {

	// 회원가입
	public void patientJoin(PatientVO patient);
	
	// 아이디 중복검사 
	public int idCheck(String patient_id);
	
	// 로그인
	public PatientVO patientLogin(PatientVO patient);
	
}
