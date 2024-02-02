package kr.co.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.hospital.model.AdminVO;
import kr.hospital.model.NoticeVO;
import kr.hospital.service.AdminService;
import kr.hospital.service.NoticeService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@Autowired
	NoticeService noticeService;
	
	 /* 관리자 메인 페이지 이동 */
    @RequestMapping(value="dashboard", method = RequestMethod.GET)
    public void adminDashboardGET() throws Exception{
        
    }
    
    // 관리자 로그인
    @RequestMapping(value = "login", method=RequestMethod.POST)
    public String adminloginPOST(HttpServletRequest request, AdminVO admin, RedirectAttributes rttr) throws Exception{
    	
    	HttpSession session = request.getSession();
    	AdminVO avo = adminService.adminLogin(admin);
    	
        if (avo == null) {
        	int result = 0;
        	rttr.addFlashAttribute("result",result);
            return "redirect:/admin/login.jsp";
        } 
        
        session.setAttribute("admin", avo);
        
        return "redirect:/main";
    }
    
    // 관리자 로그아웃
    @RequestMapping(value="logout", method=RequestMethod.GET)
	public String logoutMainGET(HttpServletRequest request) throws Exception{
	        
	   HttpSession session = request.getSession();
	   session.invalidate();
	        
	   return "redirect:/main";        
	}
    
    // 공지사항 등록
    @RequestMapping(value = "registr", method=RequestMethod.POST)
    public String registr(NoticeVO notice, RedirectAttributes rttr) throws Exception{
    	
    	noticeService.registr(notice);
    	
    	return "redirect:/admin/notice";
    }
    
    
}