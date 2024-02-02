package kr.hospital.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hospital.mapper.PatientMapper;
import kr.hospital.model.PatientVO;

@Service
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	PatientMapper patientMapper;
	
	// 회원가입
	@Override
	public void patientJoin(PatientVO patient) throws Exception {
		patientMapper.patientJoin(patient);
	}

	// 아이디 중복검사
	@Override
	public int idCheck(String patient_id) throws Exception {
		return patientMapper.idCheck(patient_id);
	}
}
