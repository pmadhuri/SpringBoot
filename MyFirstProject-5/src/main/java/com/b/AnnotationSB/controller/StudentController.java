package com.b.AnnotationSB.controller;

import com.b.AnnotationSB.model.Student;
import com.b.AnnotationSB.service.StudentService;
public class StudentController {

	public StudentController() {
		super();
		System.out.println("StudentController constructor called");
	}


	public Student saveStudentController(Student stu) {
		
		System.out.println(stu);
		System.out.println("I am from StudentController");
		StudentService ss=new StudentService();
		 Student saveStudentService=  ss.saveStudentService(stu);
		
		return saveStudentService;
		
	}
}
