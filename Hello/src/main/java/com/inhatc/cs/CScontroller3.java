package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inhatc.domain.MemberVO;
import com.inhatc.domain.ProductVO;

@Controller
public class CScontroller3 {
	@RequestMapping("doD")
	public String doD( Model model ) {
		
		System.out.println("doD called!!!!!!!!");
		ProductVO product = new ProductVO("inhatc Product", 1000);
		
		
		model.addAttribute(product);
		
		
		
		return "productDetail";
		
		
	}
	
	@RequestMapping("doE")
	public String doE( Model model ) {
		
		System.out.println("doD called!!!!!!!!");
		MemberVO memberVO = new MemberVO("√÷¡ˆ«ı");
		
		
		model.addAttribute(memberVO);
		
		
		
		return "member";
		
		
	}
	
}
