package com.springExampleWith_Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext apc=new ClassPathXmlApplicationContext("beans.xml");
		  Jio jio= apc.getBean("j",Jio.class);
		jio.browsing();
		jio.calling();
		Vodafone vodafone=apc.getBean("v",Vodafone.class);
		vodafone.browsing();
		vodafone.calling();
	}

}
