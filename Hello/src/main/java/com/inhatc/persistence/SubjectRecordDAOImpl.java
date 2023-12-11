package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.inhatc.domain.SubjectRecordVO;

@Repository
public class SubjectRecordDAOImpl implements SubjectRecordDAO{

	@Inject 
	private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.sbjrecordMapper";
	
	
	@Override
	public void inserts( SubjectRecordVO vo){
		sqlSession.insert(namespace+".inserts", vo);
	}
	
	
	@Override
	public SubjectRecordVO readMembers(int no) throws Exception {
		return sqlSession.selectOne(namespace + ".select", no);
	}
	
	@Override
	public SubjectRecordVO readWithPW(int no, int korean) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("no", no);
		paramMap.put("korean", korean);
		return sqlSession.selectOne(namespace + ".selectWithPW", paramMap);
	}
	
	@Override
	public void modify(SubjectRecordVO vo )throws Exception{
		sqlSession.update(namespace+".update", vo);
	}
	@Override
	public void delete(int no) throws Exception{
		sqlSession.delete(namespace+".delete",no);
	}
	@Override
	public List<SubjectRecordVO> listAll() throws Exception{
		return sqlSession.selectList(namespace+".listAll");
	}
}
