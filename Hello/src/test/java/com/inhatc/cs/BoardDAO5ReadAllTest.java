package com.inhatc.cs;

import java.util.List;

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
public class BoardDAO5ReadAllTest {
	@Inject
	private BoardDAO dao;
	
	@Test
	public void readAll() throws Exception{
		System.out.println("----------test-------------");
		List<BoardVO> listBoard = dao.listAll();
		int nDataCount = listBoard.size();
		System.out.println("Data Count: " + nDataCount);
		for(int i=0; i<nDataCount; i++) {
			System.out.println("---------------------------");
			System.out.println("Data Index: " + i);
			System.out.println("bno: " + listBoard.get(i).getBno());
			System.out.println("content: " + listBoard.get(i).getContent());
			System.out.println("writer: " + listBoard.get(i).getWriter());
			System.out.println("regdate: " + listBoard.get(i).getRegdate());
			System.out.println("viewcnt: " + listBoard.get(i).getViewcnt());
			System.out.println("---------------------------");
		}
		
	}
}
