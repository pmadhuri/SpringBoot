package com.b.annotationSpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.b.annotationSpringBoot.model.Student;
import com.b.annotationSpringBoot.repository.StudentRepository;

@Service
public class StudentService {
	//1 feild injection
	//@Autowired
	//private StudentRepository studentRepository;
	
	//2 Constructor injection
private StudentRepository studentRepository;
@Autowired
public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
		System.out.println("StudentService Parameterized constructor called");
		
	}

//3  setter injection
//private StudentRepository studentRepository;
/*@Autowired
	public void setStudentRepository(StudentRepository studentRepository) {
	this.studentRepository = studentRepository;
	System.out.println("studentService setter method");
}*/

	public StudentService() {
		super();
		System.out.println("StudentService constructor called");
	}

	public Student saveStudentService(Student stu) {
		System.out.println(stu);
		//StudentRepository studentRepository=new StudentRepository();
		
		Student saveStudentDao = studentRepository.saveStudentDao(stu);
		
		return saveStudentDao;
		
		
	}
	
}
