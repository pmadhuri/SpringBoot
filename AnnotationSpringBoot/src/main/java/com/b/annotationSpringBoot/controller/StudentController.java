package com.b.annotationSpringBoot.controller;

import org.springframework.stereotype.Controller;

import com.b.annotationSpringBoot.model.Student;
import com.b.annotationSpringBoot.service.StudentService;

//@Controller
public class StudentController {

	public StudentController() {
		super();
		System.out.println("StudentController constructor called");
	}
	
	
	
	public Student saveStudentController(Student stu) {
		System.out.println(stu);
		StudentService studentService=new StudentService();
		Student saveStudentService = studentService.saveStudentService(stu);
		
		return saveStudentService;
		
		
	}

}
