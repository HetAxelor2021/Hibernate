package com.HH.InheritanceMappingProj;

import javax.persistence.Entity;

@Entity
public class MyEmployee extends Person{
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "MyEmployee [company=" + company + "]";
	}
	
}
