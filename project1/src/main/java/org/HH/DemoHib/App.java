package org.HH.DemoHib;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.*;

public class App {
	public static void main(String[] args) {
		
		AlienName an = new AlienName();
		an.setFname("Hetul");
		an.setLname("Chaudhary");
		an.setMname("Kesharbhai");
		
		
		Alien telusko = new Alien();
		telusko.setId(101);
		telusko.setColor("Green");
		telusko.setName(an);
		
//		telusko.setId(102);
//		telusko.setName("Sarang");
//		telusko.setColor("white");
		
//		telusko = null;
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
		
		
//		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		session.beginTransaction();
		session.save(telusko);
		
		telusko = (Alien) session.get(Alien.class, 102);
		
		session.getTransaction().commit();
		
		System.out.println(telusko);
		
		
	}
}
