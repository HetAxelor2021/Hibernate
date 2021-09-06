package com.cascade;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {

	@Id
	private int aId;
	private String ans;
	@ManyToOne
	private Question question;
	Answer(int aId, String ans , Question q){
		this.aId = aId;
		this.ans   = ans;
		this.question = q;
	}
}
