package com.hh.LaptopStudentProjEx;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		laptop.setId(101);
		laptop.setLname("Dell");
		
		Student s = new Student();
		s.setName("Navin");
		s.setRollno(1);
		s.setMarks(50);
		s.getLaptop().add(laptop);
		
		
		laptop.getStudent().add(s);
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//		ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
//		Alien a1 = session.get(Alien.class, 1);
		
		
		session.save(laptop);
		session.save(s);
		session.getTransaction().commit();
	}
	
}
