package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo","in.example.demo.dao"})
public class AnnotationComponentScanApplication {

	public static void main(String[] args) {
		System.out.println("started");
		SpringApplication.run(AnnotationComponentScanApplication.class, args);
		System.out.println("ended");
	}

}
