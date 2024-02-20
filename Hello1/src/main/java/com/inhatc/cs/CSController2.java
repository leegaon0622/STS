package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CSController2 {
	@RequestMapping("doC")
	public String doC(@ModelAttribute("msg") String msg) {
		System.out.println("doC Called~~");//msg 파라미터를 받아서 {msg} 변수값 출력
		return "result";
	}

}
