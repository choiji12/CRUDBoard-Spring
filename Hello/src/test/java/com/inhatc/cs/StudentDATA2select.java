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


public class StudentDATA2select {

	@Inject
	private StudentinfoDAO dao;
	
	@Test
	public void readMembers() throws Exception{
		System.out.println("-------------------------test----------------");
		StudentinfoVO vo = dao.readMembers("202144023");
		
		System.out.println("ID:" + vo.getStudentID());
		System.out.println("Name:" + vo.getStudentName());
		
		System.out.println("------------");
		System.out.println("-----------------------------------------");
		
	}
	
	@Test
	public void readwithPW() throws Exception{
		System.out.println("-------------------------test----------------");
		StudentinfoVO vo = dao.readWithPW("202144033","ÃÖÁö¿ª");
		System.out.println("ID:" + vo.getStudentID());
		System.out.println("Name:" + vo.getStudentName());
		
		System.out.println("------------");
		System.out.println("-----------------------------------------");
		
	}
}
