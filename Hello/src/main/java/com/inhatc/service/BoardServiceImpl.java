package com.inhatc.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Criteria;
import com.inhatc.persistence.BoardDAO;
import com.inhatc.domain.SearchCriteria;

@Service
public class BoardServiceImpl implements BoardService {
	@Inject
	private BoardDAO dao;
	
	@Override
	public void regist(BoardVO board) throws Exception{
		dao.create(board);
	}
	
	@Override
	public BoardVO read(int bno) throws Exception{
		return dao.read(bno);
	}
	
	@Override
	public void modify(BoardVO board) throws Exception{
		dao.update(board);
	}
	
	@Override
	public void remove(int bno) throws Exception{
		dao.delete(bno);
	}
	
	@Override
	public List<BoardVO> listAll() throws Exception{
		return dao.listAll();
	}
	
	@Override
	public List<BoardVO> listPage(int page) throws Exception{
		return dao.listPage(page);
	}
	
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception{
		return dao.listCriteria(cri);
				
	}
	@Override
	public int TotalDataCount() throws Exception{
		return dao.TotalDataCount();
	}
	
	@Override
	  public List<BoardVO> listSearch(SearchCriteria cri)throws Exception {

	    return dao.listSearch(cri);
	  }

	  @Override
	  public int listSearchCount(SearchCriteria cri) throws Exception {

	    return dao.listSearchCount(cri);
	  }
}

