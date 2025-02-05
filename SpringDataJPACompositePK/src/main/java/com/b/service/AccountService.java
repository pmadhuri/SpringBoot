package com.b.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.b.dao.AccountDao;
import com.b.entity.Account;

@Service
public class AccountService {
	@Autowired
	private AccountDao dao;
	public void saveAccData() {
		Account a=new Account(12,234,455.00,134,"sbroad","xyz");
		dao.save(a);
		
		
		
		
		
	}

}
