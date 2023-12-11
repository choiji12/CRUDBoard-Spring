package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.StudentinfoVO;
import com.inhatc.persistence.StudentinfoDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		
		)


public class StudentDATA1insert {

	@Inject
	private StudentinfoDAO dao;
	
	@Test
	public void testInserts() throws Exception{
		StudentinfoVO vo = new StudentinfoVO();
		vo.setStudentID("20213ㄴ23");
		vo.setStudentName("최지혁");
		vo.setDepCode(1);
		vo.setAdress("전주");
		vo.setPhone("010-8334-1272");
		vo.setEmail("chlwlgur3@naver.com");
		dao.inserts(vo);
	}
}
