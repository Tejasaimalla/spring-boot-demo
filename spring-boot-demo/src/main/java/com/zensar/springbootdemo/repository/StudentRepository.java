package com.zensar.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.springbootdemo.entity.Student;

public interface StudentRepository extends  JpaRepository<Student, Integer>{
	
}
