package com.inhatc.domain;

public class LabmasterVO {
	private String labID;
	private String labName;
	private int labAvail;
	private String location;
	private String labClass;
	private String resDep;
	public String getLabID() {
		return labID;
	}
	public void setLabID(String labID) {
		this.labID = labID;
	}
	public String getLabName() {
		return labName;
	}
	public void setLabName(String labName) {
		this.labName = labName;
	}
	public int getLabAvail() {
		return labAvail;
	}
	public void setLabAvail(int labAvail) {
		this.labAvail = labAvail;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLabClass() {
		return labClass;
	}
	public void setLabClass(String labClass) {
		this.labClass = labClass;
	}
	public String getResDep() {
		return resDep;
	}
	public void setResDep(String resDep) {
		this.resDep = resDep;
	}
	
	@Override
	public String toString() {
		return "LabmasterVO [labID=" + labID + ", labName=" + labName + ", labAvail=" + labAvail + ", location="
				+ location + ", labClass=" + labClass + ", resDep=" + resDep + "]";
	}
	
	
	
}
