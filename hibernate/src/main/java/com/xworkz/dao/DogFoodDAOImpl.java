package com.xworkz.dao;

import org.hibernate.HibernateException;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.entity.DogFood;

public class DogFoodDAOImpl implements DogFoodDAO {

	static SessionFactory buildSessionFactory;

	static {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(DogFood.class);
		buildSessionFactory = configuration.buildSessionFactory();
	}

	@Override
	public void saveDogFood(DogFood dogFood) {

		try (Session session = buildSessionFactory.openSession();) {

			System.out.println("Hibernate connection framework start");
			// buildSessionFactory = configuration.buildSessionFactory();

			Transaction beginTransaction = session.beginTransaction();
			session.save(dogFood);
			beginTransaction.commit();
			session.close();

		} catch (ObjectNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void getDogFoodByPrice(double price) {
		try(Session session=buildSessionFactory.openSession();) {
			System.out.println("Get method started");
			DogFood dogFood=session.get(DogFood.class, price);
			System.out.println(dogFood.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
