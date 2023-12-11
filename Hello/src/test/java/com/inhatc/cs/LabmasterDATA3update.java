package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.LabmasterVO;
import com.inhatc.persistence.LabmasterDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		
		)


public class LabmasterDATA3update {

	@Inject
	private LabmasterDAO dao;
	
	@Test
	public void updatelabmaster() throws Exception{
		LabmasterVO vo = new LabmasterVO();
		vo.setLabID("���α׷���");
		vo.setLabName("���α׷��� �ǽ���2");
		vo.setLabAvail(20);
		vo.setLocation("4-403");
		vo.setLabClass("pc�ǽ�2");
		vo.setResDep("��ǻ�ͽý��۰�");
		dao.modify(vo);
			
		
	}
}
