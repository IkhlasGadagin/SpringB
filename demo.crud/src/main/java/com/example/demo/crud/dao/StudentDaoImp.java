package com.example.demo.crud.dao;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;



import com.example.demo.crud.entity.Students;

import jakarta.persistence.EntityManager;


@Repository  //everything from DB is comming here
public class StudentDaoImp implements StudentDao {
	EntityManager eman;     //achieve Hibernate configuration 
	StudentDao s;     //instance variable
	
	
	public StudentDaoImp(StudentDao s) {  //constructor
		super();
		this.s = s;
	}
	@Autowired           //every things happens automatically
	public StudentDaoImp(EntityManager eman) {      //eman is treted as instance variable 
		super();
		this.eman = eman;
	}
	@Override
	public List<Students> getStudents() {
		// TODO Auto-generated method stub
		Session sess= eman.unwrap(Session.class);  //open window
		
		Query<Students> query =sess.createQuery("from Students",Students.class);    //using HQL 
		List<Students> slist=query.getResultList();
		
		
		
		return slist;
		
	}
	@Override
	public Students oneStudent(int id) {
		// TODO Auto-generated method stub
		Session sess= eman.unwrap(Session.class);
		Students s=sess.get(Students.class, id);
		
		return s;
	}
	@Override
	public void deleteOneStudent(int id) {
		// TODO Auto-generated method stub
		Session sess= eman.unwrap(Session.class);
		Query<Students> s=sess.createQuery("delete from Students where id="+id);
		   s.executeUpdate();    
		
	}
	}

