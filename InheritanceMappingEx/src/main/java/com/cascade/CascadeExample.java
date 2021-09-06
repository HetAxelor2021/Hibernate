package com.cascade;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CascadeExample {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(Answer.class).addAnnotatedClass(Question.class).buildSessionFactory();
		Session s = factory.openSession();
		
		Question q1 = new Question();
		q1.setQuestionId(567);
		q1.setQuestion("What is cascading...");
		
		Answer a1 = new Answer(2434,"in hibernate important concept",q1);
		Answer a2 = new Answer(255,"second ans",q1);
		Answer a3 = new Answer(35,"third ans",q1);
		Answer a4 = new Answer(36,"fourth ans",q1);
		Answer a5 = new Answer(37,"fifth ans",q1);
		List<Answer> list = new ArrayList<>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		list.add(a4);
		list.add(a5);
		
		
		
		
		q1.setAnswer(list);
		
		org.hibernate.Transaction tx = s.beginTransaction();
		s.save(q1);
//		s.save(a1);
//		s.save(a2);
//		s.save(a3);
		tx.commit();
		
		s.close();
		factory.close();
	}
}
