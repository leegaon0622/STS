package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CSController4 {
	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr) {
		System.out.print("doE ȣ�� /DOf�� ��ȯ��.");
		rttr.addFlashAttribute("msg", "redirected");
		return "redirect:/doF"; //view�� �ƴ� redirect
		
	}
	
	@RequestMapping("/doF")
	public void doF(String msg) {
		System.out.print("doF called......." + msg);
	}

}
