package com.
hh.LaptopStudentProjEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

//import org.checkerframework.checker.units.qual.s;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main(String[] args) {
		
		Random r = new Random();
		System.out.println("1");
		Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
		SessionFactory sf = config.buildSessionFactory();
		System.out.println("0");
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
		
		System.out.println("2");
		List<Student> lstu = new ArrayList<>();
		ls.add(l1);
		ls.add(l2);
		Student s1 = session.get(Student.class, 1);
		lstu.add(s1);
//		l1.setStudent(s1);
//		l2.setStudent(s1);
		s1.setLaptop(ls);
		
		
		System.out.println("3");
		
		List<Laptop> ls2 = new ArrayList<>();
		ls2.add(l3);
		ls2.add(l4);
		Student s2 = session.get(Student.class, 2);
		s2.setLaptop(ls2);
//		l3.setStudent(s2);
		lstu.add(s2);
		l1.setStudent(lstu);
		
		System.out.println("4");
		List<Student> lstu2 = new ArrayList<>();
		List<Laptop> ls3 = new ArrayList<>();
		ls3.add(l5);
		ls3.add(l6);
		Student s3 = session.get(Student.class, 3);
		s3.setLaptop(ls3);
		lstu2.add(s3);
		
//		l5.setStudent(s3);
//		l6.setStudent(s3);
		
		Student s4 = session.get(Student.class,4);
		lstu2.add(s4);
		l2.setStudent(lstu2);
		
		
		
		session.flush();
		
		session.getTransaction().commit();
		session.clear();
		session.close();
		sf.close();
	}
	
}
