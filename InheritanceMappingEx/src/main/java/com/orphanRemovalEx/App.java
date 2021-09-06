package com.orphanRemovalEx;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transaction;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Post.class).addAnnotatedClass(PostComment.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		
		PostComment p1 = new PostComment();
		p1.setReview("Best look");
		
		PostComment p2 = new PostComment();
		p2.setReview("A must-read");
		
//		List<PostComment> lst = new ArrayList<>();
		
		
		Post post = new Post();
		post.setTitle("High");
//		lst.add(p1);
//		lst.add(p2);
		post.addComment(p1);
		post.addComment(p2);
		
		session.persist(post);
		session.flush();
		
		Post post1= session.createNativeQuery("""
				select *
				from Post p  inner join post_comment c
				on p.id = c.post_id
				
				where p.id = :id
				order by p.id, c.id
				
				""",Post.class).setParameter("id",1).uniqueResult();
		
		post1.removeComment(post1.getComments().get(0));
		
		session.getTransaction().commit();
		
		
	}
	

	
	
	
}
