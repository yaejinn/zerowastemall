package com.green.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NoitceController {

   // header.jsp���� notice_list�� �ޱ�
   // Notice�������� ������� ����(notice-Ȩ ȭ��)	
	@GetMapping(value="/notice_list")
   public String noticeList() {   // TODO: Model �־�� ��.
      
      return "notice/noticeList";
   }
}


