package com.inhatc.domain;

import java.sql.Date;

public class SubjectRecordVO {
	private int no;
	private int korean;
	private int english;
	private int math;
	private Date regdate;
	private Date updatedate;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public Date getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Date updatedate) {
		this.updatedate = updatedate;
	}
	@Override
	public String toString() {
		return "SubjectRecordVO [no=" + no + ", korean=" + korean + ", english=" + english + ", math=" + math
				+ ", regdate=" + regdate + ", updatedate=" + updatedate + "]";
	}

	
}
