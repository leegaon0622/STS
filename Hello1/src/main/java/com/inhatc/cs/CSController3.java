package com.inhatc.cs;
import com.inhatc.domain.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CSController3 {
	@RequestMapping("/doD")
	public String doD(Model model) {
		//make sample data
		ProductVO product = new ProductVO("ÄÄÇ»ÅÍ", 10000);
		System.out.println("doD Called~~");
		model.addAttribute(product);
		return "productDetail";
	}
}
