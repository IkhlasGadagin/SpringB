package com.example.demo.crud.dao;

import java.util.List;

import com.example.demo.crud.entity.Students;

public interface StudentDao {
	List<Students> getStudents(); //abstract () fetch all data
	Students oneStudent( int id); //fetch 1 row for id
	void deleteOneStudent(int id);//delete row for id
	
}
