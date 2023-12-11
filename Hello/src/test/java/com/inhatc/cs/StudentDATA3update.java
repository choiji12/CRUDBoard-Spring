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


public class StudentDATA3update {

	@Inject
	private StudentinfoDAO dao;
	
	@Test
	public void updateMembers() throws Exception{
		StudentinfoVO vo = new StudentinfoVO();
		vo.setStudentID("202144023");
		vo.setStudentName("ȫ�浿");
		dao.modify(vo);
			
		
	}
}
