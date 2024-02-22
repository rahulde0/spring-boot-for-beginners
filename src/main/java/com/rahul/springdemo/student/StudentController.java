package com.rahul.springdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public List<Student> findAllStudents(){
		return studentService.findAllStudents();
	}

}
