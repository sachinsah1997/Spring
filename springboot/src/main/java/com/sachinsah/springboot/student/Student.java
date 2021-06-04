package com.sachinsah.springboot.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table	
public class Student {

	@Id
	private int studentId;
	private String studentName;
	private int age;
	private String city;
	
	public Student(int studentId, String studentName, int age, String city) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.city = city;
	}

	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", city=" + city
				+ "]";
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

}
