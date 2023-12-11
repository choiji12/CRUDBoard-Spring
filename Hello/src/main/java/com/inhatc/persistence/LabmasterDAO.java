package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.LabmasterVO;


public interface LabmasterDAO {

	
	public void inserts( LabmasterVO vo);
	public LabmasterVO readlabmaster(String labID) throws Exception;
	public void modify(LabmasterVO vo )throws Exception;
	public void delete(String labID) throws Exception;	
	public List<LabmasterVO> listAll() throws Exception;
}
