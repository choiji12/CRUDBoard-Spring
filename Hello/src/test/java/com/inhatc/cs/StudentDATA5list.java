package com.inhatc.cs;

import java.util.List;

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


public class StudentDATA5list {

	@Inject
	private StudentinfoDAO dao;
	
	@Test
	public void readMembers() throws Exception{
		System.out.println("-------------------------test----------------");
		List<StudentinfoVO> list = dao.listAll();
		int nDataCount = list.size();
		System.out.println("Data Count:"+ nDataCount);
		for(int i =0; i<nDataCount; i++) {
		System.out.println("-------------------------test----------------");
		System.out.println("Data Index: " +i);
		System.out.println("ID: " +list.get(i).getStudentID());
		System.out.println("Name: " +list.get(i).getStudentName());
		System.out.println("DepCode: " +list.get(i).getDepCode());
		System.out.println("Adress: " +list.get(i).getAdress());
		System.out.println("phone: " +list.get(i).getPhone());
		System.out.println("Email: " +list.get(i).getEmail());
		System.out.println("-------------------------test----------------");}
		
		
		
	}}
	
	