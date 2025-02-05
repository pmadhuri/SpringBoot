package com.b.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.b.entity.UserCQ;

public interface UserCQDao extends JpaRepository<UserCQ, Serializable> {

	
	@Query (value="select * from UserCQ where name=:name", nativeQuery = true)
	public UserCQ getUserCQByName(String name);
	@Query("from UserCQ where name=:name")
	public UserCQ getUserCQByNameHql(String name);
	
	
}
