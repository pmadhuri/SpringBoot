package com.b.AnnotationSB.model;

public class Student {
	
	private String sname;
	private int sid;
	private String sadd;
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", sadd=" + sadd + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSadd() {
		return sadd;
	}
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	
	
	

}
