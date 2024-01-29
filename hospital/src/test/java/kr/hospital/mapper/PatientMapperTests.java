package kr.hospital.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.hospital.model.PatientVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class PatientMapperTests {
	
	@Autowired
	private PatientMapper patientMapper;
	
	// 회원가입 쿼리 테스트 메소드
	/*
	 * @Test 
	 * public void patientJoin() throws Exception{
	 * 
	 * PatientVO patient = new PatientVO();
	 * 
	 * patient.setPatient_id("test11"); patient.setPatient_pw("test");
	 * patient.setPatient_name("test"); patient.setPatient_phone("test");
	 * patient.setPatient_birth("2011-11-11"); patient.setPatient_address1("test");
	 * patient.setPatient_address2("test"); patient.setPatient_address3("test");
	 * patient.setPatient_gender("test"); patient.setPatient_blood("test");
	 * 
	 * patientMapper.patientJoin(patient); }
	 */
	
	// 아이디 중복검사 테스트
	@Test
	public void patientIdChk() throws Exception{
		String id = "test";
		String id2 = "ttttttt";
		patientMapper.idCheck(id);
		patientMapper.idCheck(id2);
	}

}