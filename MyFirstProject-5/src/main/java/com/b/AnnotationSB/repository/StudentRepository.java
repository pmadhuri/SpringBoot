package com.b.AnnotationSB.repository;

import com.b.AnnotationSB.model.Student;

public class StudentRepository {

	public StudentRepository() {
		super();
		System.out.println("StudentRepository constructor called");
	}
	
	
	
	public Student SaveStudentDao( Student stu) {
		System.out.println(stu);
		System.out.println("I am from StudentRepository");
		//logiv to DB
		System.out.println(stu);
		System.out.println("I am from StudentRepository");
		return stu;
		
	}

}
