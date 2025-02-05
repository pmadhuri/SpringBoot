package com.dependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.JavaConfig;

public class Test {

	public static void main(String[] args) {
	AnnotationConfigApplicationContext apc=new AnnotationConfigApplicationContext(JavaConfig.class);
	Student s=apc.getBean("stu",Student.class);//Prototype constructor call 2 time for s and s1
	s.m1();
	Student s1=apc.getBean("stu",Student.class);
	s1.m1();
	Employee e=apc.getBean("employee",Employee.class);//Singleton constructor call only one time
	e.m2();
	Employee e1=apc.getBean("employee",Employee.class);
	e1.m2();
	
	
	}

}
