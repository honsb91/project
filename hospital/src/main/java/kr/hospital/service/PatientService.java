package kr.hospital.service;

import kr.hospital.model.PatientVO;

public interface PatientService {
	
	// 회원가입 로직
	public void patientJoin(PatientVO patient) throws Exception;
	
	// 아이디 중복검사
	public int idCheck(String patient_id) throws Exception;

}
