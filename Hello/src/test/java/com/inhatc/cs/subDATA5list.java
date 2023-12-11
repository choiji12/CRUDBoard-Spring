package com.inhatc.cs;

import java.util.List;

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


public class subDATA5list {

	@Inject
	private SubjectRecordDAO dao;
	
	@Test
	public void readMembers() throws Exception{
		System.out.println("-------------------------test----------------");
		List<SubjectRecordVO> list = dao.listAll();
		int nDataCount = list.size();
		System.out.println("Data Count:"+ nDataCount);
		for(int i =0; i<nDataCount; i++) {
		System.out.println("-------------------------test----------------");
		System.out.println("Data Index: " +i);
		System.out.println("No: " +list.get(i).getNo());
		System.out.println("Korean: " +list.get(i).getKorean());
		System.out.println("English: " +list.get(i).getEnglish());
		System.out.println("Math: " +list.get(i).getMath());
		System.out.println("-------------------------test----------------");}
		
		
		
	}}
	
	