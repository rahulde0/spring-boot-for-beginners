package com.rahul.springdemo.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.rahul.springdemo.dao.StudentRepository;
import com.rahul.springdemo.entity.Student;

@Service
@Primary
public class DBStudentService implements StudentService{

	private final StudentRepository repository;
	
	public DBStudentService(StudentRepository repository) {
		this.repository = repository;
	}

	@Override
	public Student save(Student student) {
		return repository.save(student);
	}

	@Override
	public List<Student> findAllStudents() {
		return repository.findAll();
	}

	@Override
	public Student findByEmail(String email) {
		return repository.findByEmail(email);
	}

	@Override
	public Student update(Student student) {
		return repository.save(student);
	}

	@Override
	public void delete(String email) {
		repository.deleteByEmail(email);
	}

}
