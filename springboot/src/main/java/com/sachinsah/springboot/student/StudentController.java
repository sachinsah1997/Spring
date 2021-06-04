package com.sachinsah.springboot.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

	private final StudentRepository studentRepository;
	
	@Autowired
	public StudentController(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@GetMapping
	public List<Student> getStudents() {

		Student student =  new Student(1,"sachin sah",18, "Surat");
		studentRepository.save(student);
		return studentRepository.findAll();
		//return List.of(new Student(1,"Sachin Sah", 24,"Siwan"));
	}
}
