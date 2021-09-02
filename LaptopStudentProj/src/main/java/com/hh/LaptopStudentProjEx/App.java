package com.
hh.LaptopStudentProjEx;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

public class App {
	
	public static void main(String[] args) {
//		Laptop l1 = new Laptop();
//		l1.setId(101);
//		l1.setLname("Dell");
//		l1.setPrice(1000);
//		Laptop l2 = new Laptop();
//		l2.setId(102);
//		l2.setLname("Apple");
//		l2.setPrice(2000);
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
////		Student s = new Student();
////		s.setName("Navin");
////		s.setRollno(1);
////		s.setMarks(50);
////		s.getLaptop().add(laptop);
//		
////		
////		laptop.getStudent().add(s);
//		
		Alien a = new Alien();
		a.setAid(1);
		a.setAname("Navin");
		a.setColor("green");
//		
//		laptop.setAlien(a);
//		l1.setAlien(a);
//		l3.setAlien(a);
//		l5.setAlien(a);
		Alien b = new Alien();
		b.setAid(2);
		b.setAname("Rahul");
		b.setColor("white");
//		
//		l2.setAlien(b);
//		l4.setAlien(b);
//		
//
		Alien c = new Alien();
	c.setAid(3);
	c.setAname("Mayank");
		c.setColor("red");
		
		
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
////		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory();
		
		Session session = sf.openSession();
////		session.save(a);
////		session.save(b);
////		session.save(c);
		session.beginTransaction();
		
		Query q1 = session.createQuery("from Alien where aid=1");
		
		a = (Alien)q1.uniqueResult();
		Alien aa= (Alien)session.get(Alien.class, 1);
		System.out.println(aa);
		
		session.getTransaction().commit();
		session.close();
		
		Session session2 = sf.openSession();
		session2.beginTransaction();
		Query q2= session2.createQuery("from Alien where aid=1");
		
		a = (Alien)q1.uniqueResult();
		System.out.println(a);
		
//		a = (Alien) session2.get(Alien.class, 1);
//		System.out.println(a);
		
		
		
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
