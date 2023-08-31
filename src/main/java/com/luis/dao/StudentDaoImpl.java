package com.luis.dao;

import org.springframework.stereotype.Repository;

import com.luis.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao{
	@Override
	public void insert(Student student) {
		System.out.println(student.toString());
	}
}
