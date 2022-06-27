package com.xworkz.dao;

import com.xworkz.entity.DogDTO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DogDAOImpl implements DogDAO {
	static Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(DogDTO.class);

	@Override
	public void saveDog(DogDTO dogDto) {
		// Configuration configuration = new Configuration();
		// configuration.configure("hibernate.cfg.xml");
		// configuration.addAnnotatedClass(DogDTO.class);

		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		// DogDTO dogDTO = new DogDTO();
		openSession.save(dogDto); // openSession.persist(dogDto);
		beginTransaction.commit();
		openSession.close();
	}

	@Override
	public void getDog(int dogId) {

		System.out.println("getByID....method is invoked");
		/*
		 * Configuration configuration = new Configuration();
		 * configuration.configure("hibernate.cfg.xml");
		 * configuration.addAnnotatedClass(DogDTO.class);
		 */
		SessionFactory buildSessionFactory = configuration.buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		// beginTransaction.begin();

		DogDTO dogDto = openSession.get(DogDTO.class, dogId); // or openSession.load(DogDTO.class,dogId);

		System.out.println("---------------------------" + dogDto);
		beginTransaction.commit();
		openSession.close();
		System.out.println("data added successfully..........");
	}

	@Override
	public void updateDog(int dogId) {
		try {

			System.out.println("getByID....method is invoked");
			/*
			 * Configuration configuration = new Configuration();
			 * configuration.configure("hibernate.cfg.xml");
			 * configuration.addAnnotatedClass(DogDTO.class);
			 */

			SessionFactory buildSessionFactory = configuration.buildSessionFactory();
			Session openSession = buildSessionFactory.openSession();
			Transaction beginTransaction = openSession.beginTransaction();
			DogDTO dogDTO = openSession.get(DogDTO.class, dogId);
			dogDTO.setName("Tommy");
			dogDTO.setColor("White");
			openSession.update(dogDTO);
			beginTransaction.commit();
			// buildSessionFactory.close();
			openSession.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void deleteDogId() {

	}

}
