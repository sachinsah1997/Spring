package com.sachinsah.springorm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.sachinsah.springorm.Student;

public class StudentDao {
	
	private HibernateTemplate studentHibernateTemplate;
	
	public String insert(Student student){
		this.studentHibernateTemplate.save(student);
		return "row inserted";
	}

}
