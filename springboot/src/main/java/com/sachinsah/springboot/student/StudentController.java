package com.sachinsah.springboot.student;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

	@GetMapping
	public List<Student> getStudents() {
		return List.of(new Student(1,"Sachin Sah", 24,"Siwan"));
	}
}
