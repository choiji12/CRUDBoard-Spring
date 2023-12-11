package com.inhatc.domain;

public class MemberVO {

	private String member;

	@Override
	public String toString() {
		return "MemberVO [member=" + member + "]";
	}

	public MemberVO(String member) {
		super();
		this.member = member;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}
	
}
