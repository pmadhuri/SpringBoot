package com.b.annotationSpringBoot.repository;

import org.springframework.stereotype.Repository;

import com.b.annotationSpringBoot.model.Student;

//@Repository
public class StudentRepository {

	public StudentRepository() {
		super();
		System.out.println("StudentRepository constructor called");
	}

	
	public Student saveStudentDao(Student stu) {
		System.out.println(stu);
		//logic to save data
		System.out.println(stu);
		System.out.println("*******************************");
		
		return stu;
		
		
	}
}
