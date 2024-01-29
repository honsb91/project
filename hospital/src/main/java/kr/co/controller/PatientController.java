package kr.co.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.hospital.model.PatientVO;
import kr.hospital.service.PatientService;

@Controller
@RequestMapping(value = "/member")
public class PatientController {

	@Autowired
	PatientService patientService;
	
	//회원가입 페이지 이동
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public void joinGET() {
				
	}
	
	// 회원가입
	@RequestMapping(value = "/join", method=RequestMethod.POST)
	public String joinPOST(PatientVO patient) throws Exception{
		// 회원가입 서비스 실행
		patientService.patientJoin(patient);
		return "redirect:/main";
	}
	
	// 아이디 중복검사 로직
	@RequestMapping(value = "/patientIdChk", method = RequestMethod.POST)
	@ResponseBody // join.jsp로 메서드의 결과가 반환되지 않음
	public String patientIdChkPOST(String patient_id) throws Exception {
		int result = patientService.idCheck(patient_id);
		
		if(result != 0) {
			return "fail"; // 중복 아이디가 존재함
		}else {
			return "success";
		}
	}
	
	//로그인 페이지 이동
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void loginGET() {
		
		
	}
	
}