package kr.co.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.hospital.model.NoticeVO;
import kr.hospital.service.NoticeService;


@Controller
@RequestMapping("/board/*")
public class BoardController {

	
	@Autowired
	private NoticeService noticeService;
	
	// faq 목록페이지
	@GetMapping("/faq")
	public void faqGET() {
	        
	        
	}
	
	// 공지사항 목록페이지
	@GetMapping("/notice")
    public void noticeGET(Model model) {
        
		model.addAttribute("notice", noticeService.getList());
        
    }
    
	// 공지사항 작성페이지
    @GetMapping("/notwriter")
    public void noticeWriterGET() {
        
    }
    
    // 공지사항 작성
    @PostMapping("/notwriter")
    public String noticeWriterPOST(NoticeVO notice, RedirectAttributes rttr) throws Exception {
    	
    	noticeService.registr(notice);
    	
    	rttr.addFlashAttribute("result", "notwriter success");
    	
    	return "redirect:/board/notice";
    	
    }
    
    // 공지사항 조회
    @GetMapping("/notpage")
    public void noticeGetPageGET(int notice_no, Model model) {
    	
    	model.addAttribute("pageInfo", noticeService.getPage(notice_no));
    }
    
    // 공지사항 수정페이지
    @GetMapping("/notmodify")
    public void noticeModifyGET(int notice_no, Model model) {
    	
    	model.addAttribute("pageInfo", noticeService.getPage(notice_no));
    }
    
    // 공지사항 수정
    @PostMapping("/notmodify")
    public String noticeModifyPOST() {
    	
    	return "redirect:/board/notice";
    }
    
    // 질문게시판 페이지
 	@GetMapping("/qsboard")
 	public void qsboardGET() {
 	        
 	        
 	}
}
