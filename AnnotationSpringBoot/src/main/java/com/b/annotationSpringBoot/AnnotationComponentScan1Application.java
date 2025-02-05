package com.b.annotationSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.b.annotationSpringBoot.controller.StudentController;
import com.b.annotationSpringBoot.model.Student;
import com.b.annotationSpringBoot.model.TwoNumAdd;

@SpringBootApplication
public class AnnotationComponentScan1Application {

	public static void main(String[] args) {
		System.out.println("Application started");
		SpringApplication.run(AnnotationComponentScan1Application.class, args);
		System.out.println("Application ended");
		
		Student stu=new Student();
		stu.setsId(111);
		stu.setsName("madhuri");
		stu.setsAdd("Pune");
		  
		StudentController studentController=new StudentController();
		Student saveStudentController = studentController.saveStudentController(stu);
		System.out.println("saveStudentController Data   "+saveStudentController);
		
	System.out.println("Simple Addtion method call");
	TwoNumAdd a=new TwoNumAdd();
	int result = a.add(10, 20);
	System.out.println(result);
		
		
		
	}

}
