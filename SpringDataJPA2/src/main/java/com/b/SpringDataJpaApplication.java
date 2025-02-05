package com.b;

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

import com.b.dao.StudentDao;
import com.b.entity.Student;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
	
		//properties file : deleted:        	SpringApplication.run(SpringDataJpaApplication.class, args);
		ConfigurableApplicationContext context=	SpringApplication.run(SpringDataJpaApplication.class, args);
		StudentDao bean=context.getBean(StudentDao.class);
		//1
//		System.out.println("records from db by using name");
//		Student byName = bean.findByName("madhuri");
//		System.out.println(byName);
		
		//2
		
		Student student=bean.findByNameAndCity("sunil", "nagar");
		System.out.println(student);
		
		//3
		List<Student> byMarksGreaterThan = bean.findByMarksGreaterThan(80);
		for(Student s:byMarksGreaterThan) {
			System.out.println(s);
		}
		
		
		
		
		
//		//Example Matcher
//		System.out.println("Example Matcher");
//		Student s=new Student();
//		s.setCity("Pune");
//		
//		ExampleMatcher matcher=ExampleMatcher.matching().withIgnorePaths("Id","name","marks")
//				                .withMatcher("city", ExampleMatcher.GenericPropertyMatchers.contains());
//		
//		Example<Student> ex=Example.of(s,matcher);
//		
//		List<Student> stu = bean.findAll(ex);
//		for(Student student:stu) {
//			System.out.println(student);
//			
//		}
//		
//		//Pagination
//		System.out.println("Pagination");
//		
//		PageRequest page=PageRequest.of(1, 3);
//		Page<Student> studentPage = bean.findAll(page);
//		for(Student stupage:studentPage) {
//			System.out.println(stupage);
//		}
		
		
		//Student student=new Student("madhuri","Pune",76);
		//1 save()
		//bean.save(student);
		//2
		/*Student s1=new Student("Anil","mumbai",45);
		Student s2=new Student("swati","Pune",67);
		Student s3=new Student("sunil","nagar",65);
		Student s4=new Student("Ram","Pune",79);
		Student s5=new Student("madhuri","mumbai",55);
		Student s6=new Student("tanvi","satara",75);
		Student s7=new Student("Anvi","Nashik",90);
		List<Student> l=new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);
		bean.saveAll(l);*/
		
		//3
//		Optional< Student> student=bean.findById(4);
//		System.out.println(student.get());
		
		//4
		/*List<Student> all=bean.findAll();
		for(Student s:all) 
		{
		System.out.println(s);
		}*/
		
		
		//5
		boolean existById=bean.existsById(5);
		System.out.println(existById);
		//6
		//bean.deleteById(1);
		//7
		long count=bean.count();
		System.out.println(count);
		//8 A
		//bean.deleteAll();
		
		//9 findAllById
	//	List<Student>  list=bean.findAllById(Iterable<Integer> );
		//10  deleteAllById
		
		//****************update***************************************
		//11    update multiple records using saveAll method
		
		Optional<Student> studentById = bean.findById(14);
		 studentById.get().setName("John Smith"); // Update user name
		 studentById.get().setCity("sangliU");
         bean.save(studentById.get()); // Save the updated user
		
	}

}
