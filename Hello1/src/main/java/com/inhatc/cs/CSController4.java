package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CSController4 {
	@RequestMapping("/doE")
	public String doE(RedirectAttributes rttr) {
		System.out.print("doE 호출 /DOf로 전환함.");
		rttr.addFlashAttribute("msg", "redirected");
		return "redirect:/doF"; //view가 아닌 redirect
		
	}
	
	@RequestMapping("/doF")
	public void doF(String msg) {
		System.out.print("doF called......." + msg);
	}

}
