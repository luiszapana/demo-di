package com.luis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.luis.dao.StudentDao;
import com.luis.model.Student;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired 
	private StudentDao studentDao;//  = new StudentDaoImpl(); 
	
	@PostMapping // el método post se emplea para la inserción de datos
	public void insertStudent(@RequestBody Student student) {
		studentDao.insert(student);
	}
}
