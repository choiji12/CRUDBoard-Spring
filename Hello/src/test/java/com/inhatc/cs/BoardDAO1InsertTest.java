package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}  
		)
public class BoardDAO1InsertTest {
	@Inject
	private	BoardDAO dao;
	
	@Test
	public void Insert() throws Exception {
		BoardVO vo = new BoardVO();
		vo.setTitle("제목~~~~");
		vo.setContent("내용~~~");
		vo.setWriter("글쓴이");
		dao.create(vo);
	}
}
