package com.HH.InheritanceMappingProj.Cascade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//import antlr.collections.List;

@Entity
public class Person {
	@Id
	@GeneratedValue
	(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
	private List<Address> address;
}
