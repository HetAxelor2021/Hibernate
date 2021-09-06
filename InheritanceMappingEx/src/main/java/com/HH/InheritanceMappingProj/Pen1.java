package com.HH.InheritanceMappingProj;

import javax.persistence.Entity;

@Entity
public class Pen1 extends MyProduct{
	private String color;

	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Pen [color=" + color + "]";
	}
	
}
