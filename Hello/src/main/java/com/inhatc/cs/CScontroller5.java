package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inhatc.domain.ProductVO;

@Controller
public class CScontroller5 {

	@RequestMapping("doJSON")
	public @ResponseBody ProductVO doJSon() {
		
		ProductVO vo = new ProductVO("inhatc1", 100);
		System.out.println("doJSON Called~~~");
		
		return vo;
	}
}
