package com.rahul.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.springdemo.entity.Student;
import com.rahul.springdemo.service.StudentService;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping
	public List<Student> findAllStudents(){
		return service.findAllStudents();
	}
	
	@PostMapping
	public Student save(@RequestBody Student student) {
		return service.save(student);	
	}
	
	@GetMapping("/{email}")
	public Student findByEmail(@PathVariable String email) {
		return service.findByEmail(email);
	}
	
	@PutMapping
	public Student updateStudent(@RequestBody Student student) {
		return service.update(student);
	}
	
	@DeleteMapping("/{email}")
	public void delete(@PathVariable String email) {
		service.delete(email);
	}

}
