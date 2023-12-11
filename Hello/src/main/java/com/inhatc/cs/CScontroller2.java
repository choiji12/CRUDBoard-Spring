package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CScontroller2 {
	@RequestMapping("doC")
	public String doC( @ModelAttribute("msg") String msg ){
		System.out.println("doC called!!!!");
		return "result";
		
	}
}
