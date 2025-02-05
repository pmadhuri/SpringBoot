package com.b.annotationSpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.b.annotationSpringBoot.model.Student;
import com.b.annotationSpringBoot.service.StudentService;

@Controller
public class StudentController {
	//1 Feild Injection
	//@Autowired
	//private StudentService studentService;
	
	
    //2 setter injection
	//private StudentService studentService;
	/*@Autowired
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
		System.out.println("studentController setter method");
	}*/
	//3 constructor injection
	private StudentService studentService;

		@Autowired
		public StudentController(StudentService studentService) {
			super();
			this.studentService = studentService;
			System.out.println("StudentController Parameterized constructor called");
		}
		
		

	public StudentController() {
		super();
		System.out.println("StudentController constructor called");
	}
	
	


	public Student saveStudentController(Student stu) {
		System.out.println(stu);
		//StudentService studentService=new StudentService();
		Student saveStudentService = studentService.saveStudentService(stu);
		
		return saveStudentService;
		
		
	}

}
