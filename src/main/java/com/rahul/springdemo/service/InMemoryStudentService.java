package com.rahul.springdemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rahul.springdemo.dao.InMemoryStudentDAO;
import com.rahul.springdemo.entity.Student;

@Service
public class InMemoryStudentService implements StudentService {
	
	private final InMemoryStudentDAO dao;
	
	public InMemoryStudentService(InMemoryStudentDAO dao) {
		this.dao=dao;
	}

	@Override
	public List<Student> findAllStudents() {
		return dao.findAllStudents();
	}

	@Override
	public Student save(Student student) {
		return dao.save(student);
	}

	@Override
	public Student findByEmail(String email) {
		return dao.findByEmail(email);
	}

	@Override
	public Student update(Student student) {
		return dao.update(student);
	}

	@Override
	public void delete(String email) {
		dao.delete(email);
	}

}
