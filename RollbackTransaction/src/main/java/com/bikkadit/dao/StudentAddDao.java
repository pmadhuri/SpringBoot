package com.bikkadit.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikkadit.entity.StudentAddress;

public interface StudentAddDao extends JpaRepository<StudentAddress, Serializable> {

}
