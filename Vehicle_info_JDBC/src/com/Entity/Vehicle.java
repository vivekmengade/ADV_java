package com.Entity;

public class Vehicle {
	int vid;
	String VName;
	int Milage;
	String VNo;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVName() {
		return VName;
	}
	public void setVName(String vName) {
		VName = vName;
	}
	public int getMilage() {
		return Milage;
	}
	public void setMilage(int milage) {
		Milage = milage;
	}
	public String getVNo() {
		return VNo;
	}
	public void setVNo(String vNo) {
		VNo = vNo;
	}
	public Vehicle(int vid, String vName, int milage, String vNo) {
		super();
		this.vid = vid;
		VName = vName;
		Milage = milage;
		VNo = vNo;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", VName=" + VName + ", Milage=" + Milage + ", VNo=" + VNo + "]";
	}
	
	
}
