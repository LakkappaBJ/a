package com.xworkz.DAO;

import java.util.List;

import javax.persistence.RollbackException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.xworkz.doggy.dog;
import com.xworkz.entity.DogEntity;
import com.xworkz.sessionfactoryp.*;

public class DogDAOImpl implements DogDAO {

	@Override
	public void savedog(DogEntity dogentity) {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			Transaction transaction = session.beginTransaction();
			session.persist(dogentity);
			transaction.commit();
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
		}
	}

	@Override
	public void getDogId(int id) {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			
			dog d1 = session.find(dog.class, id);
			System.out.println("The Dog Name is " + d1.getName());
//		Transaction transaction = session.beginTransaction();		
//		transaction.commit();
		} catch (IllegalArgumentException i) {
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		}
	}

	@Override
	public void update() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			Transaction transaction = session.beginTransaction();
			dog db = session.get(dog.class, 5);
			db.setName("chetan");
			transaction.commit();
		} catch (IllegalArgumentException i) {
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		}
	}

	@Override
	public void delete() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			;
			dog dk = session.find(dog.class, 10);
			session.remove(dk);
			Transaction transaction = session.beginTransaction();
			transaction.commit();
			session.close();
		} catch (IllegalArgumentException i) {
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		}
	}

	@Override
	public void getDogDetails() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String dog = "from DogEntity";
			Query query =session.createQuery(dog);
			List l = query.list();
			System.out.println(l);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
		}
	}

	@Override
	public void countDogs() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String count ="from DogEntity";
			Query query = session.createQuery(count);
			List l = query.list();
			System.out.println("Total dogs ="+l.size());
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
		}
	}

	@Override
	public void maxWeight() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String max="select max(weight)from DogEntity";
			Query query = session.createQuery(max);
			Object l = query.uniqueResult();
			System.out.println(l);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
		}
	}

	@Override
	public void minWeight() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			//Query query = session.createQuery("");
			Query query = session.getNamedQuery("x");
			Object k = query.uniqueResult();
			System.out.println(k);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
		}
	}

	@Override
	public void avgWeight() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String avg ="select avg(weight)from DogEntity ";
			Query query = session.createQuery(avg);
			Object m = query.uniqueResult();
			System.out.println(m);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
		}
	}

	@Override
	public void sumOfWeight() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String sum ="select sum(weight)from DogEntity";
			Query query = session.createQuery(sum);
			Object s = query.uniqueResult();
			System.out.println(s);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
		}
	}

	@Override
	public void nameStartsWith() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String start ="select name from DogEntity where name LIKE 'C%'";
			Query query = session.createQuery(start);
			Object s = query.list();
			System.out.println(s);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}
}

	@Override
	public void nameEndsWith() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String end ="select name from DogEntity where name LIKE '%y'";
			Query query = session.createQuery(end);
			Object s = query.list();
			System.out.println(s);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}
		
		
	}

	@Override
	public void weightBetweenDogs() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String betn = "from DogEntity where weight BETWEEN 30 and 65";
			Query q = session.createQuery(betn);
			List l = q.list();
			System.out.println(l);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}
		
	}

	@Override
	public void updateColourByName(String colour,String name) {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			Transaction transaction = session.beginTransaction();
			String nam = "UPDATE DogEntity set colour='"+colour+"' where name='"+name+"'";
			Query query = session.createQuery(nam);
			Object o = query.executeUpdate();
			System.out.println("updateColourByName");
			transaction.commit();
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}
	}

	@Override
	public void updateNameByWeight(int weight) {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			Transaction transaction = session.beginTransaction();
			String wtf = "UpDaTe DogEntity set name='Cesar' where weight='"+weight+"'";
			Query query = session.createQuery(wtf);
			Integer i = query.executeUpdate();
			System.out.println("updateNameByWeight");
			transaction.commit();
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}
	}

//	@Override
//	public void insertNewDog() {
//		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
//		try (Session session = sessionFactory.openSession()) {
//			Transaction transaction = session.beginTransaction();
//			String str = "(InSerT into DogEntity (7,'Chetan','yellow','male',100)SeLeCt id,name,colour,gender,weight from DogEntity)";
//			Query query = session.createQuery(str);
//			Object result = query.executeUpdate();
//			System.out.println(result);
//			transaction.commit();
//		} catch (HibernateException e) {
//		} catch (RollbackException r) {
//		} catch (NullPointerException n) {
//	}


	@Override
	public void deleteByColour(String colour) {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			Transaction transaction = session.beginTransaction();
			String wtf = "DeLeTe from DogEntity wheRe colour='"+colour+"' ";
			Query query = session.createQuery(wtf);
			Object res = query.executeUpdate();
			System.out.println("deleteByColour");
			transaction.commit();
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}
	}

	@Override
	public void getDogsByGender(String gender) {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String gen = "froM DogEntity where gender='"+gender+"'";
			Query query = session.createQuery(gen);
			List results = query.list();
			System.out.println(results);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}
	}

	@Override
	public void duplicatesByGender() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String sop = "SeLecT DisTincT gender from DogEntity";
			Query query = session.createQuery(sop);
			List res = query.list();
			System.out.println(res);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}
	}

	@Override
	public void getByWeightandId() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String st = "from DogEntity wHere weight=40 AnD id=4";
			Query query = session.createQuery(st);
			Object result = query.uniqueResult();
			System.out.println(result);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}
	}

	@Override
	public void getByNameOrColour() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String stop = "FRom DogEntity wherE name='PInKy' oR colour='pInk'";
			Query query = session.createQuery(stop);
			Object result = query.uniqueResult();
			System.out.println(result);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}
	}

	@Override
	public void dogContainsLetter() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String n = "from DogEntity where name LiKe '%N%'";
			Query query =session.createQuery(n);
			List result = query.list();
			System.out.println(result);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}		
	}

	@Override
	public void orderByWeight() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String orm = "from DogEntity order by weight";
			Query query = session.createQuery(orm);
			Object result = query.list();
			System.out.println(result);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}		
	}

	@Override
	public void orderByName() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String orm = "from DogEntity order by name";
			Query query = session.createQuery(orm);
			List result = query.list();
			System.out.println(result);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}		
	}

	@Override
	public void orderByIdDesc() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String orm = "from DogEntity order by id desc";
			Query query = session.createQuery(orm);
			List result = query.list();
			System.out.println(result);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}		
	}

	@Override
	public void orderByColourDesc() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String orm = "from DogEntity orDer bY colour desc";
			Query query = session.createQuery(orm);
			List result = query.list();
			System.out.println(result);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}		
	}

	@Override
	public void weightGreaterthan() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String mj="from DogEntity where weight>50";
			Query query = session.createQuery(mj);
			List result = query.list();
			System.out.println(result);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}		
	}
 
	@Override
	public void weightLesserthan() {
		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
		try (Session session = sessionFactory.openSession()) {
			String mj="from DogEntity where weight<55";
			Query query = session.createQuery(mj);
			List result = query.list();
			System.out.println(result);
		} catch (HibernateException e) {
		} catch (RollbackException r) {
		} catch (NullPointerException n) {
	}				
	}

//	@Override
//	public void findSecondHighest() {
//		SessionFactory sessionFactory = SessionFactoryProvider.getSessionFactory();
//		try (Session session = sessionFactory.openSession()) {
//			String sec="Select top(1) weight from(select top(2) weight from DogEntity order by weight desc)order by weight asc";
//			Query query = session.createQuery(sec);
//			Object wt = query.uniqueResult();
//			System.out.println(wt);
//		} catch (HibernateException e) {
//		} catch (RollbackException r) {
//		} catch (NullPointerException n) {
//	}				

		
	}


