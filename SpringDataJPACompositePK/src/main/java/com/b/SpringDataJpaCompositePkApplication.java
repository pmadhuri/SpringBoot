package com.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.b.service.AccountService;

@SpringBootApplication
public class SpringDataJpaCompositePkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaCompositePkApplication.class, args);
		
		AccountService service = context.getBean(AccountService.class);
	service.saveAccData();
	//composite primary key o/p
//	
//	  Hibernate: create table account (acc_id integer not null, acc_num integer not null, crn integer not null,
//	             acc_holder_name varchar(255),
//                 bal float(53) not null, branch varchar(255), primary key (acc_id, acc_num, crn)) engine=InnoDB
	}

}
