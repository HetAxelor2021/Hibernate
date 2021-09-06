package com.HH.InheritanceMappingProj;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Pen extends MyProduct{
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
