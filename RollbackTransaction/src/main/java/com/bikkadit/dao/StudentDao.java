package com.bikkadit.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadit.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

	public Student findByName(String name);
	
	public Student findByNameAndCity(String name,String city);
	
	public List<Student> findByMarksGreaterThan(int marks);
	
}
