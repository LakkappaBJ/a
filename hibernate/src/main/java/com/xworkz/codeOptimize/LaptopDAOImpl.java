package com.xworkz.codeOptimize;

import org.hibernate.HibernateException;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LaptopDAOImpl implements LaptopDAO {

	static SessionFactory buildSessionFactory;
	static {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Laptop.class);
		buildSessionFactory = configuration.buildSessionFactory();

	}

	@Override
	public void saveLap(Laptop laptop) {

		try(Session openSession = buildSessionFactory.openSession();) { //try with resources java 8 feature
			//automatically close connection (called as autoClosable)
	
			Transaction transaction = openSession.beginTransaction();
			openSession.save(laptop);
			transaction.commit();

		} catch (ObjectNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (HibernateException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		
		
		/*finally {
			if (openSession != null) {
				System.out.println("------------session closed---------");
				openSession.close();
			}
		}*/

		
		//instead of that
		/*
		 * Configuration configuration = new
		 * Configuration().configure("hibernate.cfg.xml")
		 * .addAnnotatedClass(Laptop.class); SessionFactory buildSessionFactory =
		 * configuration.buildSessionFactory(); Session openSession =
		 * buildSessionFactory.openSession(); Transaction beginTransaction =
		 * openSession.beginTransaction(); System.out.println(beginTransaction);
		 * openSession.save(laptop); beginTransaction.commit(); openSession.close();
		 */
		
		//---------------- learn singleton design pattern-----------
		
		
	}
}