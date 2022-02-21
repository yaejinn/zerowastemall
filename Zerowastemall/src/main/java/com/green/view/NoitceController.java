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



/*
 * Notice details(view) 게시글 상세보기
 * noticeList.jsp의 notice_view?nseq=
 * nseq를 NoticeVO 객체로 받음
 */
/*
@GetMapping(value="/notice_view")
public String notcieView(NotcieVO vo, Model model) {
		
		NoticeVO notice = noticeService.getNotice(vo.getNseq());
		model.addAttribute("noticeVO", notice);
		
		return "notice/noticeView"; // jsp
	}	
}
*/

// 	 * Notice details(view) 게시글 상세보기
//   * noticeList.jsp의 notice_view?nseq=
	@GetMapping(value="/notice_view") 
	public String notcieView() {
		return "notice/noticeDetails"; // jsp
	}

}
