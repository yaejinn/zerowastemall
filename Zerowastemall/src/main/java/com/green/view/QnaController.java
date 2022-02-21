package com.green.view;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.green.biz.dto.MemberVO;
import com.green.biz.dto.QnaVO;
import com.green.biz.qna.QnaService;

@Controller
public class QnaController {

	@Autowired
	QnaService qnaService;
	
	/*
	 * ȸ��id�� �������� ��� Q&A ��ȸ
	 */
	
	/*
	@GetMapping(value="/qna_list")
	public String qnaList(HttpSession session, Model model) {
		
		// ȸ�� �α��� Ȯ��
		MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");
		
		if(loginUser == null) {
			return "member/login"; // jsp
		} else { 
			List<QnaVO> qnaList = qnaService.listQna(loginUser.getId());
			
			model.addAttribute("qnaList", qnaList); // qnaList.jsp�� ${qnaList}
			
			return "qna/qnaList"; // jsp
			
		}
	}
	*/
	// Q&A ����Ʈ �ҷ�����
	@GetMapping(value="/qna_list")
	public String qnaList() {
		return "qna/qnaList"; // jsp
	}
	
	
	/*
	 * Q&A �� �ҷ�����
	 */
	/*
	@GetMapping(value="/qna_write_form")
	public String qnaWriteView(HttpSession session) {
		MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "member/login"; // jsp
		} else {
			return "qna/qnaWrite"; // jsp
		}
	}
	*/
	//  Q&A �� �ҷ�����
	@GetMapping(value="/qna_write_form")
	public String qnaWriteView() {
		return "qna/qnaWrite"; // jsp
	}
	
	/*
	 * Q&A ��-> �ۼ��Ϸ� (��ư:�۵�� Ŭ���� // �������� �� Q&A����Ʈ�� �̵�)
	 */
	/*
	@PostMapping(value="/qna_write")
	public String qnaWrite(QnaVO vo, HttpSession session) {
		MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "member/login"; // jsp
		
		// �����id ������ QnaVO ��ü�� ����	
		// qnaService ��ü���� insertQna(qnaVO, id)�� ȣ���Ͽ� �Խñ��� ����
		} else {
			vo.setId(loginUser.getId());	
			qnaService.insertQna(vo);
			
			return "redirect:qna_list"; // �Խñ� ���ȭ��(/qna_list) �̵�
		}
	}
	*/
	// Q&A ��-> �ۼ��Ϸ� (��ư:�۵�� Ŭ���� // �������� �� Q&A����Ʈ�� �̵�)
	@PostMapping(value="/qna_write")
	public String qnaWrite() {
		return "redirect:qna_list"; // �Խñ� ���ȭ��(/qna_list) �̵�
	}
	
	
	/*
	 * Q&A View �Խñ� �󼼺���	
	 * qnaList.jsp�� qna_view?qseq=
	 * qseq�� QnaVO ��ü�� ����
	 */
	/*
	@GetMapping(value="/qna_view")
	public String qnaView(QnaVO vo, HttpSession session, Model model) {
		MemberVO loginUser = (MemberVO) session.getAttribute("loginUser");
		
		if (loginUser == null) {
			return "member/login"; // jsp
		} else {
			vo.setId(loginUser.getId());	
			
			QnaVO qna = qnaService.getQna(vo.getQseq());
			model.addAttribute("qnaVO", qna);
			
			return "qna/qnaView"; // jsp
		}	
	}
	*/
	// 	 * Q&A View �Խñ� �󼼺���
	//   * qnaList.jsp�� qna_view?qseq=
	@GetMapping(value="/qna_view")
	public String qnaView() {
		return "qna/qnaView"; // jsp
	}
	
}
