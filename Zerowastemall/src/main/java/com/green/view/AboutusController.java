package com.green.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AboutusController {
	
	// header.jsp���� aboutus�� �ޱ�(���� ������)
	// About us ������ ȣ��� --- �ٸ� ��� ����
	@GetMapping(value="/aboutus")
	public String aboutus() { // TODO: Model �־�� ��.
		
		return "aboutus/aboutus";
	}
}