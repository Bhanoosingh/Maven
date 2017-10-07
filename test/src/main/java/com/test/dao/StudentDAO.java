package com.test.dao;

import java.util.List;

import com.test.model.Student;


public interface StudentDAO 
{
	void addStudent(Student student);

    Student getStudentById(int studentId);

    List<Student> getAllStudents();

    Student getStudentByUsername(String username);

}
