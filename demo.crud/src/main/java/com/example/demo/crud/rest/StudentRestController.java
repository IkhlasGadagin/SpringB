package com.example.demo.crud.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.crud.dao.ServiceStudent;
import com.example.demo.crud.dao.StudentDao;
import com.example.demo.crud.entity.Students;

@RestController               //use to convert normal class to REST API..and allows to handle all REST APIs such as GET,POST,Delete,PUT requests
@RequestMapping("/open")      //Annotation is used to map web requests onto specific handler classes and make web resourses addressable
public class StudentRestController {
	StudentDao sd;       //interface reference
	@Autowired
	ServiceStudent service;   //interface reference for inserting data in the form of JSON(map and key) to class object 

	@Autowired            // everytime constructor have to call automatically
	public StudentRestController(StudentDao sd) {
		super();
		this.sd = sd;
	}
	@GetMapping(value="data")   //@GetMapping fetch all the data in the form of List
	public List<Students> getStudents(){
	return sd.getStudents();
	}
	@GetMapping(value="/oneStudent/{id}")   //sending id in url to fetch perticular row
	public Students oneStudentdata(@PathVariable int id){
	return sd.oneStudent(id);
	}
	@Transactional       //table is modified when v delete row
	@GetMapping(value="/deleteoneStudent/{id}")
	public void deleteOneStudent(@PathVariable int id){
	sd.deleteOneStudent(id);
	}
	
	@PostMapping("save/allDetails")  //JSON to object of class using PostMan
	public Students saveStudents(@RequestBody Students student) {
	Students sta=service.saveStudents(student);
	return sta;
	}
	
	@PutMapping("save/updateDetails")
	public Students update(@RequestBody Students student) {
    Students detail =service.update(student);
	return detail;
	}
	
}
