package com.dependencyInjection_with_Spring;

public class Student {
private int sid;
private String sname;
private String sadd;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSadd() {
	return sadd;
}
public void setSadd(String sadd) {
	this.sadd = sadd;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sadd=" + sadd + "]";
}
public Student(int sid, String sname, String sadd) {
	//added
	super();
	System.out.println("constructor called");

	this.sid = sid;
	this.sname = sname;
	this.sadd = sadd;
}
public Student() {
	super();
System.out.println("Student Constructor");
}





}