package com.rahul.springdemo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Repository;

import com.rahul.springdemo.entity.Student;

@Repository
public class InMemoryStudentDAO {

	private final List<Student> students = new ArrayList<Student>();

	public List<Student> findAllStudents() {
		return students;

	}

	public Student save(Student student) {
		students.add(student);
		return student;
	}

	public Student findByEmail(String email) {
		return students.stream().filter(s -> email.equals(s.getEmail())).findFirst().orElse(null);
	}

	public Student update(Student student) {
		var studentIndex = IntStream.range(0, students.size())
				.filter(index -> students.get(index).getEmail().equals(student.getEmail())).findFirst().orElse(-1);
		if (studentIndex > -1) {
			students.set(studentIndex, student);
		}
		return student;
	}

	public void delete(String email) {
		var student = findByEmail(email);
		if (student != null) {
			students.remove(student);
		}
	}

}
