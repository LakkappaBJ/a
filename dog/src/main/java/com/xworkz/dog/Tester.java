package com.xworkz.dog;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Tester {

	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(Dog.class);
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		Dog dog=new Dog(14,"Daisy","male","Poodle","brown",22);
		session.save(dog);
		System.out.println("data inserted");
		transaction.commit();
		session.close();
		sessionFactory.close();	
		
		Configuration configuration1=new Configuration();
		configuration1.configure("hibernate.cfg.xml");
		configuration1.addAnnotatedClass(Dog.class);
		SessionFactory sessionFactory1=configuration1.buildSessionFactory();
		Session session1=sessionFactory1.openSession();
		Transaction transaction1=session1.beginTransaction();
		Dog dog1=session1.get(Dog.class, 2);
		System.out.println("data fetching"+dog1.toString());
		transaction1.commit();
		session1.close();
		sessionFactory1.close();
		
		Configuration configuration2=new Configuration();
		configuration2.configure("hibernate.cfg.xml");
		configuration2.addAnnotatedClass(Dog.class);
		SessionFactory sessionFactory2=configuration2.buildSessionFactory();
		Session session2=sessionFactory2.openSession();
		Transaction transaction2=session2.beginTransaction();
		Dog dog2=session2.get(Dog.class, 4);
		dog2.setBreed("pub");
		session2.update(dog2);
		System.out.println("Data Updated successfully");
		transaction2.commit();
		session2.close();
		sessionFactory2.close();
		
		Configuration configuration3=new Configuration();
		configuration3.configure("hibernate.cfg.xml");
		configuration3.addAnnotatedClass(Dog.class);
		SessionFactory sessionFactory3=configuration3.buildSessionFactory();
		Session session3=sessionFactory3.openSession();
		Transaction transaction3=session3.beginTransaction();
		Dog dog3=session3.get(Dog.class, 12);
		session3.delete(dog3);
		System.out.println("Data Deleted successfully");
		transaction3.commit();
		session3.close();
		sessionFactory3.close();
	}
}
