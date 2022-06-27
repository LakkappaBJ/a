package com.xworkz.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.xworkz.entity.MobileEntity;

public class MobileDAOImpl implements MobileDAO {

	static SessionFactory buildSessionFactory;
	static {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(MobileEntity.class);
		buildSessionFactory = configuration.buildSessionFactory();
	}

	@Override
	/*
	 * public void addMobiles() { Configuration configuration = new Configuration();
	 * configuration.configure("hibernate.cfg.xml").addAnnotatedClass(MobileEntity.
	 * class); SessionFactory buildSessionFactory =
	 * configuration.buildSessionFactory(); Session session =
	 * buildSessionFactory.openSession(); Transaction transaction =
	 * session.beginTransaction();
	 * 
	 * String query = "insert MobileEntity values(,'Redmi',123,'16GB',5000mh')";
	 * Query query2 = session.createQuery(query); query2.executeUpdate();
	 * System.out.println(query2);
	 * 
	 * session.close(); transaction.commit(); }
	 */
	public void addMobiles() {
		String hql = "from MobileEntity ";
		try (Session session = buildSessionFactory.openSession();) {
			Query query = session.createQuery(hql);
			List list = query.list();
			System.out.println("Rows affected: " + list);

		} catch (Exception e) {

		}
	}

	@Override
	public void getMobile() {
		try (Session session = buildSessionFactory.openSession();) {
			String query = "from MobileEntity";
			Query query2 = session.createQuery(query);
			List list = query2.list();
			System.out.println(list);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void updateByName(String name) {
		String query = "UPDATE MobileEntity SET modelName='Redmi' where memory='16GB'";
		try (Session session = buildSessionFactory.openSession();) {
			Transaction beginTransaction = session.beginTransaction();
			Query qu = session.createQuery(query);
			Object update = qu.executeUpdate();
			MobileEntity mob = (MobileEntity) update; // downcasting
			System.out.println("----------------------------" + mob);
			beginTransaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void deleteByName(MobileEntity mobileEntity) {
		try (Session session = buildSessionFactory.openSession();) {
			String hql = "delete from MobileEntity where MOBID=112";
			Transaction transaction = session.beginTransaction();
			// MobileEntity mobileEntity2 = session.get(MobileEntity.class, "Redmi");
			Query query = session.createQuery(hql);
			Object delete = query.executeUpdate();
			System.out.println("selected element deleted " + delete);
			transaction.commit();

		} catch (Exception e) {
		}

	}

	@Override
	public void getMobileDetails() {
		try (Session session = buildSessionFactory.openSession();) {
			String hql = "MobileEntity.getMobileDetails";
			Query query = session.getNamedQuery(hql);
			List list = query.list();
			System.out.println(list);
		} catch (HibernateException e) {
		}
	}

	@Override
	public void countMobiles() {
		try (Session session = buildSessionFactory.openSession();) {
			Query query = session.getNamedQuery("MobileEntity.countMobiles");
			List list = query.list();
			System.out.println(list);
		} catch (Exception e) {
		}

	}

	@Override
	public void minBatteryCapacity() {
		try (Session session = buildSessionFactory.openSession();) {
			Query query = session.getNamedQuery("maxMemorySize");
			List obj = query.list();
			System.out.println(obj);
			// MobileEntity mobileEntity = (MobileEntity) obj;
			// System.out.println(mobileEntity);
		} catch (Exception e) {
		}
	}

	@Override
	public void maxMemory() {
		try (Session session = buildSessionFactory.openSession();) {
			Query query = session.createSQLQuery("select min(BATTERYCAPACITY) from mobile_details"); // by own creating
																										// not
																										// NamedQuery
			List list = query.list();
			System.out.println(list);
		} catch (Exception e) {
		}
	}

	@Override
	public void avgMobId() {
		try (Session session = buildSessionFactory.openSession();) {
			Query query = session.getNamedQuery("avgMobileId");
			List list = query.list();
			System.out.println(list);
		} catch (Exception e) {
		}
	}

	@Override
	public void secondHighestMemrory() {
		Session session = null;
		try {
			session = buildSessionFactory.openSession();
			Query query = session.getNamedQuery("MobileEntity.secondHighest");
			List list = query.list();
			System.out.println(list);

		} catch (HibernateException e) {
			System.out.println(e.getMessage().getClass());
		} finally {
			if (session != null) {
				session.close();
			}

		}
	}

	@Override
	public void updateByMemory(String memory,String BatteryCapacity) {
		try(Session session=buildSessionFactory.openSession();){
			Transaction transaction = session.beginTransaction();
			Query query = session.getNamedQuery("MobileEntity.changeMemoryHQL");
			query.setParameter("x", memory);
			query.setParameter("y", BatteryCapacity);
			int update = query.executeUpdate();
			System.out.println(update+" row affected");
			transaction.commit();
			
		}
	}

}
