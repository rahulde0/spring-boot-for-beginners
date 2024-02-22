package com.rahul.springdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	public List<Student> findAllStudents(){
		return List.of(
				new Student("Rahul", "Deo", LocalDate.now(), "rahuldeo16@gmail.com", 12),
				new Student("Samartha", "Deo", LocalDate.now(), "samarthadeo21@gmail.com", 2)
				);
	}
	
}
