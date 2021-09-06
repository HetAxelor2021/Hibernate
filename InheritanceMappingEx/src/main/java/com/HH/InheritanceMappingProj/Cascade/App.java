package com.HH.InheritanceMappingProj.Cascade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;

//import org.hibernate.Query;
//import org.hibernate.SQLQuery;

//import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		Person p = new Person();
//		p.setId(1);
		p.setName("hetul");
		List<Address> ls = new ArrayList<>();
		
		Address ad = new Address();
		ad.setPerson(p);
		ad.setCity("Bengluru");
		ad.setHouseNumber(108);
		ad.setStreet("sai");
		ad.setZipCode(595003);
		ls.add(ad);
		

		Address ad2 = new Address();
		ad2.setPerson(p);
		ad2.setCity("surat");
		ad2.setHouseNumber(904);
		ad2.setStreet("palanpur");
		ad2.setZipCode(395005);
		ls.add(ad2);
	
		
		Configuration  config = new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Address.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
//		session.save(ad);
//		session.save(ad2);
//		session.save(p);
//		
		
		Person person = new Person();
		Address address = new Address();
		address.setPerson(person);
		person.setAddress(Arrays.asList(address));
		session.persist(person);
		session.flush();
		session.clear();
		
		
		
		Person save = session.find(Person.class, 1);
		session.remove(save);
		session.flush();
		
		session.detach(person);
		System.out.println(session.contains(person));
		
		session.getTransaction().commit();
		session.close();
		
//		Session session2 = sf.openSession();
//		session2.beginTransaction();
//		
////		session2.createNativeQuery("drop table person ");
////		Query<Address>  q= session2.createQuery("from Address");
//////		q.addEntity(Address.class);
////		List<Address> lst = q.list();
////		for(Address pr : lst) {
////			System.out.println(pr);
////		}
////		
//		session2.getTransaction().commit();
//		session2.close();
		
		
		
	}
}
