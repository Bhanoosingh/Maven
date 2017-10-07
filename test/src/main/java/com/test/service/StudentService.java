package com.test.service;

import java.util.List;

import com.test.model.Student;


public interface StudentService 
{
	void addStudent(Student student);

    Student getStudentById(int studentId);

    List<Student> getAllStudents();

    Student getStudentByUsername(String username);

}
