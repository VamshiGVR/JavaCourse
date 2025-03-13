package com.learningspring.Demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learningspring.Demo.Entity.Student;

@RestController
public class StudentController {
	
	//Return in JASON format
	@GetMapping("/Student")
	public Student getStudent() {
		Student student = new Student(0, "king", 90);
		return student;	
	}
	
	//Returns List in JASON format
	@GetMapping("/Students")
	public List<Student> GetStudents(){
		ArrayList<Student> students = new ArrayList<>(); 
		students.add(new Student(0, "A", 50));
		students.add(new Student(1, "B", 60));
		students.add(new Student(2, "V", 70));
		students.add(new Student(3, "Z", 80));
		return students;
	}
	
	//Intakes data from URL
	@GetMapping("/Students/{id}/{name}/{grade}")
	public Student TakeStudents(@PathVariable("id") int id,@PathVariable("name") String name,@PathVariable("grade") int grade) {
		Student student = new Student(id, name, grade);
		return student;
	}
}