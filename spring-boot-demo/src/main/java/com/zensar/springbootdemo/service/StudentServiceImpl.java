package com.zensar.springbootdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.springbootdemo.entity.Student;
import com.zensar.springbootdemo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student getStudent(int studentId) {

		return studentRepository.findById(studentId).get();
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public void insertStudent(Student student) {
		studentRepository.save(student);

	}

	@Override
	public void updateStudent(int studentId, Student student) {
		studentRepository.save(student);

	}

	@Override
	public void deleteStudent(int studentId) {
		studentRepository.deleteById(studentId);

	}

}