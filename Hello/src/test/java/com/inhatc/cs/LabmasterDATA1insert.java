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


public class LabmasterDATA1insert {

	@Inject
	private LabmasterDAO dao;
	
	@Test
	public void labInserts() throws Exception{
		
		LabmasterVO vo = new LabmasterVO();
		vo.setLabID("���α׷���");
		vo.setLabName("���α׷��� �ǽ���");
		vo.setLabAvail(30);
		vo.setLocation("4-401");
		vo.setLabClass("PC �ǽ�");
		vo.setResDep("��ǻ�� ������");
		
		dao.inserts(vo);
	}
}
