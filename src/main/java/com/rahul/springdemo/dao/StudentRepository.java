package com.rahul.springdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.springdemo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	Student findByEmail(String email);
	void deleteByEmail(String email);
}
