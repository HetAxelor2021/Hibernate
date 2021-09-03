package com.hh.JPAProjEx;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		
	Alien a = new Alien();
	a.setAid(9);
	a.setAname("Maria");
	a.setColor("Hara");
	
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(a);
		em.getTransaction().commit();
		
//		Alien a = em.find(Alien.class, 2);
	System.out.println(a);
	}
	
}
