package com.HH.InheritanceMappingProj;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Book extends MyProduct{
	private String author;

	@Override
	public String toString() {
		return "Book [author=" + author + "]";
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
