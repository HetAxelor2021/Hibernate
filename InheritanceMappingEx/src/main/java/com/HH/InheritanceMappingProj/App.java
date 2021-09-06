package com.HH.InheritanceMappingProj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Pet p= new Pet();
		p.setAnimalId(1);
		p.setName("dog");
		p.setSpecies("fsdjklf");
		
		Pet p2= new Pet();
		p2.setAnimalId(2);
		p2.setName("cat");
		p2.setSpecies("ccccc");
		
		Pet p3= new Pet();
		p3.setAnimalId(3);
		p3.setName("cow");
		p3.setSpecies("cwwwww");
		
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(MyEmployee.class).addAnnotatedClass(Book.class).addAnnotatedClass(Pen.class).addAnnotatedClass(MyProduct.class)
				.addAnnotatedClass(Pet.class).addAnnotatedClass(Animal.class);
		
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
//		session.save(m);
//		session.save(m2);
		session.save(p);
		session.save(p2);
		session.save(p3);
//		session.save(b);
		session.getTransaction().commit();
		session.close();
		
	}
}

//		
//		MyEmployee m= new MyEmployee();
//		m.setPersonId(1);
//		m.setCompany("HH");
//		m.setName("Hetul");
//		Person p = new Person();
//		p.setName("hetul");
//		p.setPersonId(101);
//		
//		
//		session.save(m);
//		session.save(p);

//Pen p = new Pen();
//p.setName("cello");
//p.setColor("blue");
//p.setProductId(11);
//
//Book b = new Book();
//b.setAuthor("Hetul");
//b.setProductId(22);
//b.setName("navneet");
//
//
////		MyProduct m = new MyProduct();
////		m.setName("pen");
////		m.setProductId(11);
////		
////		MyProduct m2 = new MyProduct();
////		m.setName("pen");
////		m.setProductId(11);