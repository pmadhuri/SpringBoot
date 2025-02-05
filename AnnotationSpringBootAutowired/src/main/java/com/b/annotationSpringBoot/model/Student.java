package com.b.annotationSpringBoot.model;

public class Student {
	private int sId;
	private String sName;
	private String sAdd;
	
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getsId() {
		return sId;
	}




	public void setsId(int sId) {
		this.sId = sId;
	}




	public String getsName() {
		return sName;
	}




	public void setsName(String sName) {
		this.sName = sName;
	}




	public String getsAdd() {
		return sAdd;
	}




	public void setsAdd(String sAdd) {
		this.sAdd = sAdd;
	}




	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAdd=" + sAdd + "]";
	}

	
	
	
	
}
