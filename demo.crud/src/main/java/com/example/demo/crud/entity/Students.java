package com.example.demo.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity  //table stored in DB
public class Students { //according to the table in DB
	@Id
	int id;
    String name;
	String batch;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(int id, String name, String batch) {
		super();
		this.id = id;
		this.name = name;
		this.batch = batch;
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
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", batch=" + batch + "]";
	}
	
	
	


}
