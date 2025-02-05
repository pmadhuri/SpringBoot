package com.b.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {
	//1
	public Student findByName(String name);
	//2
	public Student findByNameAndCity(String name,String city);
	//3
	public List<Student> findByMarksGreaterThan(int marks);
	
	
	

}
