package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.SubjectRecordVO;


public interface SubjectRecordDAO {

	
	public void inserts( SubjectRecordVO vo);
	public SubjectRecordVO readMembers(int no) throws Exception;
	public SubjectRecordVO readWithPW(int no, int korean) throws Exception;
	public void modify(SubjectRecordVO vo )throws Exception;
	public void delete(int no) throws Exception;	
	public List<SubjectRecordVO> listAll() throws Exception;
}
