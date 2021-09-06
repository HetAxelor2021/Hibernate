package com.HH.InheritanceMappingProj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		
		
		
		MyEmployee m= new MyEmployee();
		m.setPersonId(1);
		m.setCompany("HH");
		m.setName("Hetul");
//		Person p = new Person();
//		p.setName("hetul");
//		p.setPersonId(101);
//		
//		
		
		

		Configuration config = new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(MyEmployee.class);
		
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(m);
//		session.save(p);
		session.getTransaction().commit();
		session.close();
		
	}
}
