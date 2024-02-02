package kr.co.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AnnouncementController {

	//공지사항페이지 이동
	@RequestMapping(value = "announcement", method = RequestMethod.GET)
	public void announcementGET() {
						
	}
}
