package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentRoster;
import com.example.demo.repos.CourseRepository;
import com.example.demo.repos.StudentRosterRepository;

@RestController
public class StudentRosterController {
	
	
	@Autowired
	private StudentRosterRepository studentRosterRepository;
	
	@Autowired
	private CourseRepository CourseRepository;
	
	
	@GetMapping(value = "/all")
	public Iterable<StudentRoster> getStudents() {
		return studentRosterRepository.findAll();
	}
	
	
	
	
	
	
//	@GetMapping(value = "/StudentRoster")
//	public StudentRoster getStudentRoster(@RequestBody @Valid)
	
	

}
