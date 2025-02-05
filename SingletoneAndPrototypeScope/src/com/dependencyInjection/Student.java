package com.dependencyInjection;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stu")
@Scope("Prototype")
public class Student {
private int sid;
private String sname;
private String sadd;
//D C
public Student() {
	
	super();
	System.out.println("Student Constructor called");
}
// method
public void m1() {
	System.out.println(" Student  m1 method call");
}




}