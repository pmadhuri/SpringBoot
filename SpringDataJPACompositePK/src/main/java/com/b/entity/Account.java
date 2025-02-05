package com.b.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

@Entity
@IdClass(AccountPK.class)
public class Account {
	@Id
private Integer crn;
	@Id
private Integer accNum;
private double bal;
@Id
private Integer accId;
private String branch;
private String accHolderName;
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
public double getBal() {
	return bal;
}
public void setBal(double bal) {
	this.bal = bal;
}
public Integer getAccId() {
	return accId;
}
public void setAccId(Integer accId) {
	this.accId = accId;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getAccHolderName() {
	return accHolderName;
}
public void setAccHolderName(String accHolderName) {
	this.accHolderName = accHolderName;
}
@Override
public String toString() {
	return "Account [crn=" + crn + ", accNum=" + accNum + ", bal=" + bal + ", accId=" + accId + ", branch=" + branch
			+ ", accHolderName=" + accHolderName + "]";
}
public Account(Integer crn, Integer accNum, double bal, Integer accId, String branch, String accHolderName) {
	super();
	this.crn = crn;
	this.accNum = accNum;
	this.bal = bal;
	this.accId = accId;
	this.branch = branch;
	this.accHolderName = accHolderName;
}
public Account() {
	super();
	// TODO Auto-generated constructor stub
}




	

}
