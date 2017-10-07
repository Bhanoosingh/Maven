package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.StudentDAO;
import com.test.model.Student;
import com.test.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;
	public void addStudent(Student student) {
		studentDAO.addStudent(student);
	}

	
	public Student getStudentById(int studentId) {
		return studentDAO.getStudentById(studentId);
	}

	
	public List<Student> getAllStudents() {
		return studentDAO.getAllStudents();
	}

	
	public Student getStudentByUsername(String username) {
		return studentDAO.getStudentByUsername(username);
	}

}
