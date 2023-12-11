package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.StudentinfoVO;


public interface StudentinfoDAO {

	
	public void inserts( StudentinfoVO vo);
	public StudentinfoVO readMembers(String studentID) throws Exception;
	public StudentinfoVO readWithPW(String studentID, String studentName) throws Exception;
	public void modify(StudentinfoVO vo )throws Exception;
	public void delete(String studentID) throws Exception;	
	public List<StudentinfoVO> listAll() throws Exception;
}
