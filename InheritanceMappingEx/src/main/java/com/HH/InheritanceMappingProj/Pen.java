package com.HH.InheritanceMappingProj;


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
