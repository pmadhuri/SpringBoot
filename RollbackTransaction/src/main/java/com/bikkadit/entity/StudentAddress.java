package com.bikkadit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stu_add")
public class StudentAddress {
	@Id
	private String aid;
	private String state;
	private String pincode;
	public StudentAddress(String aid, String state, String pincode) {
		super();
		this.aid = aid;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "StudentAddress [aid=" + aid + ", state=" + state + ", pincode=" + pincode + "]";
	}
	public String getAid() {
		return aid;
	}
	public void setAid(String aid) {
		this.aid = aid;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public StudentAddress() {
		// TODO Auto-generated constructor stub
	}

}
