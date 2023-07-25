package com.example.demo.crud.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.crud.entity.Students;

@Service
public class ServiceStudent {
	
	@Autowired
	StudentsRepository sRepository; //ref variable of interface
	
	

	public Students saveStudents(Students student) {
		// TODO Auto-generated method stub
		Students ser=sRepository.save(student);   //THIS METHOD is called from CrudRepository
		return ser;
		 
	}



	public Students update(Students student) {
		// TODO Auto-generated method stub
		
		return sRepository.save(student);
	}
}
