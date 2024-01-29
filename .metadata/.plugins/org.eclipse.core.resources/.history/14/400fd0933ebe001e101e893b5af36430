package kr.hospital.mapper;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import kr.hospital.model.PatientVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class PatientMapperTest {
	
	@Autowired
	private PatientMapper patientMapper;
	
	@Test
	public void patientJoin() throws Exception{
		
		PatientVO patient = new PatientVO();
		
		patient.setPatient_id("test");
		patient.setPatient_pw("test");
		patient.setPatient_name("test");
		patient.setPatient_phone("test");
		patient.setPatient_birth("test");
		patient.setPatient_addr1("test");
		patient.setPatient_addr2("test");
		patient.setPatient_addr3("test");
		patient.setPatient_gender("test");
		patient.setPatient_blood("test");
		
		patientMapper.patientJoin(patient);
	}

}
