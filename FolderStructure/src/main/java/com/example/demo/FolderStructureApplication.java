package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FolderStructureApplication {

	public static void main(String[] args) {
		System.out.println("Application Started");
		SpringApplication.run(FolderStructureApplication.class, args);
		System.out.println("Application Ended");
	}

}
