package com.chaos.service;


import java.util.List;

import com.chaos.repository.StudentJdbcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaos.model.Student;


@Service
public class StudentService {
	@Autowired
	private StudentJdbcRepository studentJdbcRepository;

	public List<Student> findAll() {
		return studentJdbcRepository.findAll();
	}

	public Student findById(long id) {
		return studentJdbcRepository.findById(id);
	}

	public int deleteById(long id) {
		return studentJdbcRepository.deleteById(id);
	}

	public int insert(Student student) {
		return studentJdbcRepository.insert(student);
	}

	public int update(Student student) {
		return studentJdbcRepository.update(student);
	}

}
