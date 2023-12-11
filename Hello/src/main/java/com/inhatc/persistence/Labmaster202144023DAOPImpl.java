package com.inhatc.persistence;

import java.util.List;
import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.inhatc.domain.LabmasterVO;


@Repository
public class Labmaster202144023DAOPImpl implements LabmasterDAO{

	@Inject 
	private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.Labmaster202144023Mapper";
	
	
	@Override
	public void inserts( LabmasterVO vo){
		sqlSession.insert(namespace+".inserts", vo);
	}
		
	@Override
	public LabmasterVO readlabmaster(String  labID) throws Exception {
		return sqlSession.selectOne(namespace + ".select", labID);
	}
	
	@Override
	public void modify(LabmasterVO vo )throws Exception{
		sqlSession.update(namespace+".update", vo);
	}
	@Override
	public void delete(String labID) throws Exception{
		sqlSession.delete(namespace+".delete", labID);
	}
	@Override
	public List<LabmasterVO> listAll() throws Exception{
		return sqlSession.selectList(namespace+".listAll");
	}
}
