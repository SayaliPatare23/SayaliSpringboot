package com.springboot.springboot.student.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springboot.student.task.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	

}
