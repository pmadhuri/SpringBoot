package com.dependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

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
@Bean("stu")
public void m1() {
	System.out.println(" Student  m1 method call");
}




}