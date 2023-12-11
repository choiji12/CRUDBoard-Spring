package com.inhatc.cs;

import java.util.List;

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


public class LabmasterDATA5list {

	@Inject
	private LabmasterDAO dao;
	
	@Test
	public void readlabmaster() throws Exception{
		System.out.println("-------------------------test----------------");
		List<LabmasterVO> list = dao.listAll();
		int nDataCount = list.size();
		System.out.println("Data Count:"+ nDataCount);
		for(int i =0; i<nDataCount; i++) {
		System.out.println("-------------------------test----------------");
		System.out.println("Data Index: " +i);
		System.out.println("실습실ID: " +list.get(i).getLabID());
		System.out.println("실슬습Name: " +list.get(i).getLabName());
		System.out.println("가용인원: " +list.get(i).getLabAvail());
		System.out.println("위치: " +list.get(i).getLocation());
		System.out.println("실습분류: " +list.get(i).getLabClass());
		System.out.println("책임관리학과: " +list.get(i).getResDep());
		System.out.println("-------------------------test----------------");}
		
		
		
	}}
	
	