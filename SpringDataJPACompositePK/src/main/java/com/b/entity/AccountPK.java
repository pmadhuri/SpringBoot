package com.b.entity;

import java.io.Serializable;

public class AccountPK implements Serializable{
	
	private Integer crn;
	private Integer accNum;
	private Integer accId;
	public Integer getCrn() {
		return crn;
	}
	public void setCrn(Integer crn) {
		this.crn = crn;
	}
	public Integer getAccNum() {
		return accNum;
	}
	public void setAccNum(Integer accNum) {
		this.accNum = accNum;
	}
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	@Override
	public String toString() {
		return "AccountPK [crn=" + crn + ", accNum=" + accNum + ", accId=" + accId + "]";
	}
	public AccountPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AccountPK(Integer crn, Integer accNum, Integer accId) {
		super();
		this.crn = crn;
		this.accNum = accNum;
		this.accId = accId;
	}

	
	
}
