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


public class LabmasterDATA2select {

	@Inject
	private LabmasterDAO dao;
	
	@Test
	public void readlabmaster() throws Exception{
		System.out.println("-------------------------test----------------");
		LabmasterVO vo = dao.readlabmaster("���α׷���");	
		
		System.out.println("�ǽ���ID: " + vo.getLabID());
		System.out.println("�ǽ���Name: " + vo.getLabName());
		System.out.println("�����ο�: " + vo.getLabAvail());
		System.out.println("��ġ: " + vo.getLocation());
		System.out.println("�ǽ��з�: " + vo.getLabClass());
		System.out.println("å�Ӱ����а�: " + vo.getResDep());
		System.out.println("------------");
		System.out.println("-----------------------------------------");
		
	}
	
}
