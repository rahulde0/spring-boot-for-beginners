package com.rahul.springdemo.service;

import java.util.List;

import com.rahul.springdemo.entity.Student;

public interface StudentService {
	
	public Student save(Student student);
	public List<Student> findAllStudents();
	public Student findByEmail(String email);
	public Student update(Student student);
	public void delete(String email);
	
}
