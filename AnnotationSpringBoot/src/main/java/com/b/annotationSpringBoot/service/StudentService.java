package com.b.annotationSpringBoot.service;

import org.springframework.stereotype.Service;

import com.b.annotationSpringBoot.model.Student;
import com.b.annotationSpringBoot.repository.StudentRepository;

//@Service
public class StudentService {

	public StudentService() {
		super();
		System.out.println("StudentService constructor called");
	}

	public Student saveStudentService(Student stu) {
		System.out.println(stu);
		StudentRepository studentRepository=new StudentRepository();
		
		Student saveStudentDao = studentRepository.saveStudentDao(stu);
		
		return saveStudentDao;
		
		
	}
	
}
