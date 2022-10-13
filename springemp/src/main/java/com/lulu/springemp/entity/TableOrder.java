package com.lulu.springemp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class TableOrder {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String password;
	String emailId;
	public TableOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TableOrder(int id, String name, String password, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.emailId = emailId;
	}
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "TableOrder [id=" + id + ", name=" + name + ", password=" + password + ", emailId=" + emailId + "]";
	}
	

}
