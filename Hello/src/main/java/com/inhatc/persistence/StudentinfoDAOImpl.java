package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.StudentinfoVO;

@Repository
public class StudentinfoDAOImpl implements StudentinfoDAO{

	@Inject 
	private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.studentinfoMapper";
	
	
	@Override
	public void inserts( StudentinfoVO vo){
		sqlSession.insert(namespace+".inserts", vo);
	}
	
	
	@Override
	public StudentinfoVO readMembers(String studentID) throws Exception {
		return sqlSession.selectOne(namespace + ".select", studentID);
	}
	
	@Override
	public StudentinfoVO readWithPW(String studentID, String studentName) throws Exception {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("studentID", studentID);
		paramMap.put("studentName", studentName);
		return sqlSession.selectOne(namespace + ".selectWithPW", paramMap);
	}
	
	@Override
	public void modify(StudentinfoVO vo )throws Exception{
		sqlSession.update(namespace+".update", vo);
	}
	@Override
	public void delete(String studentID) throws Exception{
		sqlSession.delete(namespace+".delete",studentID);
	}
	@Override
	public List<StudentinfoVO> listAll() throws Exception{
		return sqlSession.selectList(namespace+".listAll");
	}
}
