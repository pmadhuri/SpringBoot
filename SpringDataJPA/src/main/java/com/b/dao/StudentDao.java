package com.b.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {
	

}
