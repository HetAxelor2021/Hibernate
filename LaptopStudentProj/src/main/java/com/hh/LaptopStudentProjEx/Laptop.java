package com.hh.LaptopStudentProjEx;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	private int id;
	private String lname;
	
//	@ManyToOne
	@ManyToMany
	private List<Student> student = new ArrayList<Student>() 	;
	
	
	public List<Student> getStudent() {
		return student;
	}
//	public void setStudent(List<Student> student) {
//		this.student = student;
//	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
}
