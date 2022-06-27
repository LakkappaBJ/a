package com.xworkz.dog;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DogRunner {

	public static void main(String[] args) {

		//Configuration configuration = new Configuration();
		//configuration.configure("conProps.cgf.xml"); 
		//configuration.addAnnotatedClass(Dog.class);
		
		
		Configuration configuration = new Configuration().configure("conProps.cgf.xml").addAnnotatedClass(Dog.class);
		
	
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Dog dog = new Dog(3, "Puppy", "Mudhol", "White", 30.5);
		Transaction transaction = session.beginTransaction();
		session.save(dog);
		transaction.commit();
		session.close();

	}

}
