package com.
hh.LaptopStudentProjEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

import org.checkerframework.checker.units.qual.s;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

public class App {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		for(int i=1;i<=6;i++) {
			
			
			Student s = new Student();
			s.setName("Student " +i);
			s.setRollno(i);
			s.setMarks(r.nextInt(100));

			session.save(s);
			
			
			Laptop l = new Laptop();
			l.setId(i);
			l.setLname("laptop "+i);
			l.setPrice(r.nextInt(1000));
			
			session.save(l);
			
		}
		
		List<Laptop> ls = new ArrayList<>();
		Laptop l1 = session.get(Laptop.class,1);
		Laptop l2 = session.get(Laptop.class, 2);
		Laptop l3 = session.get(Laptop.class, 3);
		Laptop l4 = session.get(Laptop.class, 4);
		Laptop l5 = session.get(Laptop.class, 5);
		Laptop l6 = session.get(Laptop.class, 6);
		
		ls.add(l1);
		ls.add(l2);
		Student s1 = session.get(Student.class, 1);
		l1.setStudent(s1);
		l2.setStudent(s1);
		s1.setLaptop(ls);
		
		List<Laptop> ls2 = new ArrayList<>();
		ls2.add(l3);
		ls2.add(l4);
		Student s2 = session.get(Student.class, 2);
		s2.setLaptop(ls2);
		l3.setStudent(s2);
		l4.setStudent(s2);
		
		List<Laptop> ls3 = new ArrayList<>();
		ls3.add(l5);
		ls3.add(l6);
		Student s3 = session.get(Student.class, 3);
		s3.setLaptop(ls3);
		l5.setStudent(s3);
		l6.setStudent(s3);
		
		
		session.getTransaction().commit();
		session.close();
	}
	
}
