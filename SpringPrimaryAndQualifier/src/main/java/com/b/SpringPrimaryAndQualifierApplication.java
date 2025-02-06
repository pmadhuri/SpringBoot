package com.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.b.controller.ReportController;

@SpringBootApplication
public class SpringPrimaryAndQualifierApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringPrimaryAndQualifierApplication.class, args);
		ReportController reportController = context.getBean(ReportController.class);
		String report = reportController.generateReport();
		System.out.println(report);
	}

}
