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
		
		for(int i=1;i<=10;i++) {
			
			
			Student s = new Student();
			s.setName("Student " +i);
			s.setRollno(i);
			s.setMarks(r.nextInt(100));
//			s.setLaptop(l);
			session.save(s);
			
			
			Laptop l = new Laptop();
			l.setId(i);
			l.setLname("laptop "+i);
			l.setPrice(r.nextInt(1000));
			session.save(l);
			
		}
		
		Student ss1 = session.get(Student.class,1 );
		Laptop ll1 = session.get(Laptop.class, 1);
		ll1.setStudent(ss1);
		

//		Student ss1 = session.get(Student.class,1 );
		Laptop ll2 = session.get(Laptop.class, 2);
		ll2.setStudent(ss1);

//		Student ss1 = session.get(Student.class,3 );
		Laptop ll3 = session.get(Laptop.class, 3);
		ll3.setStudent(ss1);

		Student ss2 = session.get(Student.class,2 );
		Laptop ll4 = session.get(Laptop.class, 4);
		ll4.setStudent(ss2);

//		Student ss1 = session.get(Student.class,1 );
		Laptop ll5 = session.get(Laptop.class, 5);
		ll5.setStudent(ss2);

//		Student ss = session.get(Student.class,6 );
		Laptop ll6 = session.get(Laptop.class, 1);
		ll6.setStudent(ss2);

		Student ss3 = session.get(Student.class,3 );
		Laptop ll7 = session.get(Laptop.class, 7);
		ll7.setStudent(ss3);

//		Student ss = session.get(Student.class,1 );
		Laptop ll8 = session.get(Laptop.class, 8);
		ll8.setStudent(ss3);

//		Student ss = session.get(Student.class,9 );
		Laptop ll9 = session.get(Laptop.class, 9);
		ll9.setStudent(ss3);
		
		
		List<Laptop> laptop = new ArrayList<Laptop>();
		
		Student s1 =session.get(Student.class, 1);
//		int j=1;
	
		
		
		laptop.add(session.get(Laptop.class,1));
		laptop.add(session.get(Laptop.class,2));
		laptop.add(session.get(Laptop.class,3));
		s1.setLaptop(laptop);
		
		List<Laptop> laptop2 = new ArrayList<Laptop>();
		
		Student s2 = session.get(Student.class, 2);
//		int j=1;
	
		
		
		laptop2.add(session.get(Laptop.class,4));
		laptop2.add(session.get(Laptop.class,5));
		laptop2.add(session.get(Laptop.class,6));
		s2.setLaptop(laptop2);
		
		List<Laptop> laptop3 = new ArrayList<Laptop>();
		Student s3 = session.get(Student.class,3);
//		int j=1;
	
		
		
		laptop3.add(session.get(Laptop.class,7));
		laptop3.add(session.get(Laptop.class,8));
		laptop3.add(session.get(Laptop.class,9));
		s3.setLaptop(laptop3);

		
		
		session.getTransaction().commit();
		session.close();
		
		
		
		
//		
//		for(int i=1;i<=10;i++) {
//			
//			
//		}
//		
//		
//		Laptop l2 = new Laptop();
//		l2.setId(102);
//		l2.setLname("Apple");
//		l2.setPrice(2000);
//
//		
//
//		Student s = new Student();
//		s.setName("Hetul");
//		s.setRollno(1);
//		s.setMarks(50);
//		s.setLaptop(l1);
//		
//		Laptop l3 = new Laptop();
//		l3.setId(103);
//		l3.setLname("Asus");
//		l3.setPrice(800);
//		
//		Laptop l4= new Laptop();
//		l4.setId(104);
//		l4.setLname("Acer");
//		l4.setPrice(15000);
////		
//		Laptop l5= new Laptop();
//		l5.setId(105);
//		l5.setLname("Samsung");
//		l5.setPrice(1400);
////		
//		
//		
		
////		
////		laptop.getStudent().add(s);
//		
//		Alien a = new Alien();
//		a.setAid(1);
//		a.setAname("Navin");
//		a.setColor("green");
//		
//		laptop.setAlien(a);
//		l1.setAlien(a);
//		l3.setAlien(a);
//		l5.setAlien(a);
//		Alien b = new Alien();
//		b.setAid(2);
//		b.setAname("Rahul");
//		b.setColor("white");
////		
////		l2.setAlien(b);
////		l4.setAlien(b);
////		
////
//		Alien c = new Alien();
//		c.setAid(3);
//		c.setAname("Mayank");
//		c.setColor("red");
//		
		
//		
//		
//		Session session = sf.openSession();
//////		session.save(a);
//////		session.save(b);
//////		session.save(c);
//		session.beginTransaction();
//		
//		Query q1 = session.createQuery("from Alien where aid=1");
//		q1.setCacheable(true);
//		
//		a = (Alien)q1.uniqueResult();
//		Alien aa= (Alien)session.get(Alien.class, 1);
//		System.out.println(aa);
//		
//		session.getTransaction().commit();
//		session.close();
//		
//		Session session2 = sf.openSession();
//		session2.beginTransaction();
//		Query q2= session2.createQuery("from Alien where aid=1");
//		q2.setCacheable(true);
//		a = (Alien)q2.uniqueResult();
//		System.out.println(a);
//		
////		a = (Alien) session2.get(Alien.class, 1);
////		System.out.println(a);
//		
//		
		
//		session.save(a);
//		session.save(b);
//		session.save(c);
//		session.save(l1);
//		session.save(l2);
//		session.save(l3);
//		session.save(l4);
//		session.save(l5);
		
//		session.flush();
//		session.close();
//////		
//		Session s = sf.openSession();
//////		
//		s.beginTransaction();
////		
//		Alien a1 = (Alien)s.get(Alien.class, 1);
//		
//		System.out.println(a1.getAname());
//		Collection<Laptop> laps = a1.getLaps();
//		
//		for(Laptop l : laps) {
//			System.out.println(l);
//		}
//		session.getTransaction().commit();
	}
	
}
