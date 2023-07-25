package com.example.demo.crud.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.crud.entity.Students;

@Repository  //everything from DB is comming here
public interface StudentsRepository extends CrudRepository<Students, Integer> {

	//CrudRepository consists of HQL inbuilt methods	
}
