package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;





@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}  
		)
public class BoardDAO2ReadTest {
	@Inject
	private	BoardDAO dao;
	
	@Test
	public void read() throws Exception{
		System.out.println("----------test-------------");
		BoardVO vo = dao.read(2);
		System.out.println("bno: " + vo.getBno());
		System.out.println("content: " + vo.getContent());
		System.out.println("writer: " + vo.getWriter());
		System.out.println("regdate: " + vo.getRegdate());
		System.out.println("viewcnt: " + vo.getViewcnt());
		System.out.println("---------------------------");
	}
	
}
