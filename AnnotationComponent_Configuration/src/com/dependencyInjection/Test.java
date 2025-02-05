package com.dependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import AnnotationBaseConfig.User;
import config.JavaConfig;

public class Test {

	public static void main(String[] args) {
	AnnotationConfigApplicationContext apc=new AnnotationConfigApplicationContext(JavaConfig.class);
	Student s=apc.getBean("stu",Student.class);
	s.m1();
	Employee e=apc.getBean("emploee",Employee.class);
	e.m2();
	
	User u=apc.getBean("user",User.class);
	u.m3();
	}

}
