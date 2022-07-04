package com.zensar.springbootdemo.service;

import java.util.List;

import com.zensar.springbootdemo.entity.Student;

public interface StudentService {
	public Student getStudent(int studentId);

	public List<Student> getAllStudents();

	public void insertStudent(Student student);

	public void updateStudent(int studentId, Student student);

	public void deleteStudent(int studentId);

}
