package com.learningspring.Demo.Entity;

public class Student {
	
	private int id ;
	private String name;
	private int grade;
	
	
	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}
	

}
