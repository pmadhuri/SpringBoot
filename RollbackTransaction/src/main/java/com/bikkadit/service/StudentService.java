package com.bikkadit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bikkadit.dao.StudentAddDao;
import com.bikkadit.dao.StudentDao;
import com.bikkadit.entity.Student;
import com.bikkadit.entity.StudentAddress;


@Service
public class StudentService {

	@Autowired
	private StudentDao sdao;
	@Autowired
	private StudentAddDao saddao;
	
	@Transactional(rollbackFor = Exception.class)
	public void saveData() {
		Student s=new Student("Swapnil", "Pune", 56);
		
		sdao.save(s);
		//int i=10/0;
		StudentAddress a=new StudentAddress("111", "MH", "432344");
		saddao.save(a);
		
		
	}
	
}
