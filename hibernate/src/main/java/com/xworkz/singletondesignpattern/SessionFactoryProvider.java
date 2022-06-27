package com.xworkz.singletondesignpattern;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.MobileEntity;

public class SessionFactoryProvider {
	public static SessionFactoryProvider instance = new SessionFactoryProvider();

	private SessionFactoryProvider() {

	}

	public static SessionFactoryProvider getSessionFactPro() {
		return instance;
	}

	public void getSessionFactoryProvider() {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(MobileEntity.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

	}
}