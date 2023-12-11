package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.MembersVO;
import com.inhatc.persistence.MembersDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		
		)


public class MembersDATA6list {

	@Inject
	private MembersDAO dao;
	
	@Test
	public void readMembers() throws Exception{
		System.out.println("-------------------------test----------------");
		List<MembersVO> listMember = dao.listAll();
		int nDataCount = listMember.size();
		System.out.println("Data Count:"+ nDataCount);
		for(int i =0; i<nDataCount; i++) {
		System.out.println("-------------------------test----------------");
		System.out.println("Data Index: " +i);
		System.out.println("UserID: " +listMember.get(i).getUserid());
		System.out.println("UserID: " +listMember.get(i).getUsername());
		System.out.println("UserEmail: " +listMember.get(i).getEmail());
		System.out.println("-------------------------test----------------");}
		
		
		
	}}
	
	