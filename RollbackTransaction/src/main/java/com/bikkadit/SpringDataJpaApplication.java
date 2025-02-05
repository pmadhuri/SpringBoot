package com.bikkadit;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.bikkadit.dao.StudentDao;
import com.bikkadit.entity.Student;
import com.bikkadit.service.StudentService;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);
		StudentService bean = context.getBean(StudentService.class);
		bean.saveData();
		
		
		
		
		//Student student = bean.findByName("Anil");
		//Student student = bean.findByNameAndCity("mohan", "mumbai");
		/*
		 * List<Student> student = bean.findByMarksGreaterThan(80); for(Student d:
		 * student) { System.out.println(d); }
		 */
	}	

}
