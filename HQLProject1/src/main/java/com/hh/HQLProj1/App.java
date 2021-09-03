package com.hh.HQLProj1;

import java.util.List;
import java.util.Random;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void main(String[] args) {
		
		
//		Laptop laptop = new Laptop();
//		laptop.setBrand("dell");
//		laptop.setId(1);
//		laptop.setPrice(1000);
//		
//		
//		
		
		
		
		
		
		
		
		Configuration  config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//		ServiceRegistry registry = new ServiceRegistryBuilder().applySetting(config.getProperties()).buildServiceRegistry();
		SessionFactory sf = config.buildSessionFactory();
		Session session  = sf.openSession();
		session.beginTransaction();
		
		Laptop l= new Laptop();
		l.setId(55);
		l.setBrand("Lenovo");
		l.setPrice(900);
		session.save(l);
//		l.setPrice(750);
		session.remove(l);
		
		session.getTransaction().commit();
//		session.detach(l);
//		l.setPrice(600);
		
		session.close();
		
		
		
		
		
		
//		Random r= new Random();
//		int b= 60;
//		Query q = session.createQuery(" select sum(marks) from Student where marks>:b");
//		q.setParameter("b", b);
//		Long marks = (Long) q.uniqueResult();
//		System.out.println(marks);
//		
//		System.out.println("hi");
//		session.save(laptop);
//		Query q = session.createSQLQuery("select * from laptop");
//		List<Laptop> l = q.getResultList();
//		System.out.println(l);
//		for(int i=1;i<=50;i++) {
//			Laptop laptop = new Laptop();
//			laptop.setId(i);
//			laptop.setBrand("brand "+i);
//			laptop.setPrice(r.nextInt(1000));
//			session.save(laptop);
//			
//		}
//		
//		
//		//native query
//		SQLQuery query = session.createSQLQuery("select name,marks from student where marks>60");
//		
//		query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
//		List students  = query.list();
//		for(Object o : students){
//			Map m= (Map)o;
//			System.out.println(m.get("name")+" : "+m.get("marks"));
//		}
		
		
		
//		query.addEntity(Student.class);
//		
//		List<Student> students = query.list();
//		
//		for(Student o : students) {
//			System.out.println(o);
//		}
		
		
		
		
		
//		Query q = session.createQuery("select rollno from Student where marks=50");
//		Integer ans  = (Integer)q.uniqueResult();
//		System.out.println(ans);
		
//		for(Object marks: students)
//			System.out.println(marks);
//			System.out.println(student[0]+" : "+student[1]+" :  "+student[2]);
		
		
		
//		Object[] student = (Object[])q.uniqueResult();
		
		
		
//		for(Object o: student) {
//			System.out.println(o);
//		}
		
		
//		System.out.println(student);
//		List<Student> students = q.list();
//		
//		for(Student s: students) {
//			System.out.println(s);
//		}
		
		
//		
//		Random r = new Random();
//		
//		for(int i=1;i<=50;i++) {
//			Student s = new Student();
//			s.setRollno(i);
//			s.setName("Name "+i);
//			s.setMarks(r.nextInt(100));
//			session.save(s);
//		}
//		
	}
}
