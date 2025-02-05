package com.refDependencyInjection_with_Java;

public class Student {
private int sid;
private String sname;
private Address sadd;
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
public Address getSadd() {
	return sadd;
}
public void setSadd(Address sadd) {
	this.sadd = sadd;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sadd=" + sadd + "]";
}
//public Student(int sid, String sname, String sadd) {
//	super();
//	this.sid = sid;
//	this.sname = sname;
//	this.sadd = sadd;
//}





}
