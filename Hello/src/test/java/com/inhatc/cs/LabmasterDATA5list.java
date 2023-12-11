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
		System.out.println("�ǽ���ID: " +list.get(i).getLabID());
		System.out.println("�ǽ���Name: " +list.get(i).getLabName());
		System.out.println("�����ο�: " +list.get(i).getLabAvail());
		System.out.println("��ġ: " +list.get(i).getLocation());
		System.out.println("�ǽ��з�: " +list.get(i).getLabClass());
		System.out.println("å�Ӱ����а�: " +list.get(i).getResDep());
		System.out.println("-------------------------test----------------");}
		
		
		
	}}
	
	