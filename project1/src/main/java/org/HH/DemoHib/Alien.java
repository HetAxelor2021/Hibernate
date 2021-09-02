package org.HH.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//@Entity(name="alien_table")
@Entity
@Table (name="alien_table")

public class Alien {
	
	@Id
	private int id;
//	@Transient
	private AlienName name;
	
	public AlienName getName() {
		return name;
	}
	public void setName(AlienName name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", color=" + color + "]";
	}
	@Column(name="alien_color")
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
