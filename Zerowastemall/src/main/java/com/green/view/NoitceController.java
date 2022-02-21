package com.green.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoitceController {

   // header.jsp에서 notice_list로 받기
   // Notice공지사항 전제목록 보기(notice-홈 화면)	
	@GetMapping(value="/notice_list")
   public String noticeList() {   // TODO: Model 넣어야 됨.
      
      return "notice/noticeList";
   }
}


