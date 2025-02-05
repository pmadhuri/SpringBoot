package com.b.AnnotationSB.service;


import com.b.AnnotationSB.model.Student;
import com.b.AnnotationSB.repository.StudentRepository;

public class StudentService {

	public StudentService() {
		super();
		System.out.println("StudentService constructor called");
		
	}
	
	
public Student saveStudentService(Student stu) {
		
		System.out.println(stu);
		System.out.println("I am from StudentService");
		StudentRepository sr=new StudentRepository();
		Student saveStudentRepository=sr.SaveStudentDao(stu);
		return stu;
		
	}

}
