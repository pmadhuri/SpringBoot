package com.b.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserCQ {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String pwd;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "UserCQ [id=" + id + ", name=" + name + ", pwd=" + pwd + ", city=" + city + "]";
	}
	public UserCQ( String name, String pwd, String city) {
		super();
		
		this.name = name;
		this.pwd = pwd;
		this.city = city;
	}
	public UserCQ() {
		super();
		
	}
	

}
