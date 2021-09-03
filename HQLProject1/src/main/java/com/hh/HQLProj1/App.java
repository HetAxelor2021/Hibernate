package com.hh.HQLProj1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {
	
	public static void main(String[] args) {
		Configuration  config = new Configuration().configure().addAnnotatedClass(Student.class);
//		ServiceRegistry registry = new ServiceRegistryBuilder().applySetting(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory();
		Session session  = sf.openSession();
		int b= 60;
		session.beginTransaction();
		Query q = session.createQuery(" select sum(marks) from Student where marks>:b");
		q.setParameter("b", b);
		Long marks = (Long) q.uniqueResult();
		System.out.println(marks);
		
//		Query q = session.createQuery("select rollno from Student where marks=50");
//		Integer ans  = (Integer)q.uniqueResult();
//		System.out.println(ans);
		
//		for(Object marks: students)
//			System.out.println(marks);
//			System.out.println(student[0]+" : "+student[1]+" :  "+student[2]);
		
		
		
//		Object[] student = (Object[])q.uniqueResult();
		
		
		
//		for(Object o: student) {
//			System.out.println(o);
//		}
		
		
//		System.out.println(student);
//		List<Student> students = q.list();
//		
//		for(Student s: students) {
//			System.out.println(s);
//		}
		
		
//		
//		Random r = new Random();
//		
//		for(int i=1;i<=50;i++) {
//			Student s = new Student();
//			s.setRollno(i);
//			s.setName("Name "+i);
//			s.setMarks(r.nextInt(100));
//			session.save(s);
//		}
//		
		session.getTransaction().commit();
	}
}
