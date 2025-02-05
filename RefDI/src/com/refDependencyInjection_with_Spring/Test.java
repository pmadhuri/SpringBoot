package com.refDependencyInjection_with_Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ClassPathXmlApplicationContext apc=new ClassPathXmlApplicationContext("beans.xml");
	Student student=apc.getBean(Student.class);
	System.out.println(student);
	

	}

}
