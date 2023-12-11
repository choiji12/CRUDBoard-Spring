package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.inhatc.domain.SubjectRecordVO;
import com.inhatc.persistence.SubjectRecordDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		
		)


public class SubDATA2select {

	@Inject
	private SubjectRecordDAO dao;
	
	@Test
	public void readMembers() throws Exception{
		System.out.println("-------------------------test----------------");
		SubjectRecordVO vo = dao.readMembers(202144024);
		System.out.println("No:" + vo.getNo());
		System.out.println("Korean:" + vo.getKorean());
		
		System.out.println("------------");
		System.out.println("-----------------------------------------");
		
	}
	
	@Test
	public void readwithPW() throws Exception{
		System.out.println("-------------------------test----------------");
		SubjectRecordVO vo = dao.readWithPW(1,50);
		System.out.println("No:" + vo.getNo());
		System.out.println("Korean:" + vo.getKorean());
		
		System.out.println("------------");
		System.out.println("-----------------------------------------");
		
	}
}
