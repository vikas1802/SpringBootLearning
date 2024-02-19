package com.example.LearnSpringBoot;

public class Courses {
 private int id;
 private String name;
 private String faculty;
 // parameterized constructor
public Courses(int id, String name, String faculty) {
	super();
	this.id = id;
	this.name = name;
	this.faculty = faculty;
}
// getter method
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getFaculty() {
	return faculty;
}
// toString Method
@Override
public String toString() {
	return "Courses [id=" + id + ", name=" + name + ", faculty=" + faculty + "]";
}

 
 
}
