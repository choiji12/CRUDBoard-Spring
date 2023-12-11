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
		LabmasterVO vo = dao.readlabmaster("프로그래밍");	
		
		System.out.println("실습실ID: " + vo.getLabID());
		System.out.println("실습실Name: " + vo.getLabName());
		System.out.println("가용인원: " + vo.getLabAvail());
		System.out.println("위치: " + vo.getLocation());
		System.out.println("실습분류: " + vo.getLabClass());
		System.out.println("책임관리학과: " + vo.getResDep());
		System.out.println("------------");
		System.out.println("-----------------------------------------");
		
	}
	
}
