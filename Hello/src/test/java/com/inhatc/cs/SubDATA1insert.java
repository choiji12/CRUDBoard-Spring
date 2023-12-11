package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.inhatc.domain.SubjectRecordVO;
import com.inhatc.persistence.SubjectRecordDAO;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
		
		)


public class SubDATA1insert {

	@Inject
	private SubjectRecordDAO dao;
	
	@Test
	public void testInserts() throws Exception{
		SubjectRecordVO vo = new SubjectRecordVO();
		vo.setNo(202144022);
		vo.setKorean(70);
		vo.setEnglish(50);
		vo.setMath(60);
		dao.inserts(vo);
	}
}
