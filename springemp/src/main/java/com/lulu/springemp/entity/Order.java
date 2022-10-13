package com.lulu.springemp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="orders")

public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	float billamount;
	String name;
	String address;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, float billamount, String name, String address) {
		super();
		this.id = id;
		this.billamount = billamount;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getBillamount() {
		return billamount;
	}
	public void setBillamount(float billamount) {
		this.billamount = billamount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", billamount=" + billamount + ", name=" + name + ", address=" + address + "]";
	}
	
	
	

}
