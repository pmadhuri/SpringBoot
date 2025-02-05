package com.b.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.b.entity.Account;

public interface AccountDao extends JpaRepository<Account, Serializable> {

}
