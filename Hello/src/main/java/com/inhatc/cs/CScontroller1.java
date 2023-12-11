package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CScontroller1 {
	
	@RequestMapping("doA")
	public void doA() {
		System.out.println("doA Called!~~~~~~~~~~~~~~~~~");
		
	}
	
	@RequestMapping("doB")
	public String doB() {
		System.out.println("doB Called!~~~~~~~~~~~~~~~~~");
		
		return "doBResult";
	}
	
}