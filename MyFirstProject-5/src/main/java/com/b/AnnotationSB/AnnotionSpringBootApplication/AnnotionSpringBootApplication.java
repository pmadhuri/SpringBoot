package com.b.AnnotationSB.AnnotionSpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.b.AnnotationSB.controller.StudentController;
import com.b.AnnotationSB.model.Student;

@SpringBootApplication
public class AnnotionSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnotionSpringBootApplication.class, args);
		
		
		
		Student stu=new Student();
		stu.setSid(12);
		stu.setSname("madhuri");
		stu.setSadd("Pune");
		
		
		StudentController sc=new StudentController();
	Student  saveStudentController=	sc.saveStudentController(stu);
	System.out.println("I am from AnnotationSpringBootApplication");
	System.out.println(saveStudentController);
		
		

	}

}
