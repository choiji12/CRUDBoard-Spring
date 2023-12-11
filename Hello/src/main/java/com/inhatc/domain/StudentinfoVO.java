package com.inhatc.domain;


public class StudentinfoVO {
	private String studentID;
	private String studentName;
	private int depCode;
	private String adress;
	private String phone;
	private String email;
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getDepCode() {
		return depCode;
	}
	public void setDepCode(int depCode) {
		this.depCode = depCode;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "studentinfoVO [studentID=" + studentID + ", studentName=" + studentName + ", depCode=" + depCode
				+ ", adress=" + adress + ", phone=" + phone + ", email=" + email + "]";
	}
	

	
}
