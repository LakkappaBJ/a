package com.xworkz.dog.dao;

import org.hibernate.HibernateException;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.xworkz.dog.Dog;
import com.xworkz.dog.entity.DogEntity;
import com.xworkz.sessionfactory.*;

public class DogDAOImpl implements DogDAO {
	
	@Override
	public void saveDogDAO(DogEntity dogEntity) {
		Session session=null;
		try {
		session=SessionFactoryProvider.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
//		DogEntity dogEntity=new DogEntity(14,"Daisy","male","Poodle","brown",22);
		session.save(dogEntity);
		System.out.println("Data Saved Successfully :"+dogEntity);
		transaction.commit();
		}catch (ObjectNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (HibernateException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(session!=null) {
			session.close();
			System.out.println("session is closed");
			}else {
				System.out.println("session is not closed");
			}
		}
	}
	
	@Override
	public void getDogById(int dogID) {
		Session session=null;
		//try(Session session=sessionFactory.openSession();){
		try {
		session=SessionFactoryProvider.getSessionFactory().openSession();
		DogEntity dogEntity =session.get(DogEntity.class, dogID);
		System.out.println("data fetched successfully"+dogEntity);
		}catch (ObjectNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (HibernateException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(session!=null) {
			session.close();
			System.out.println("session is closed");
			}else {
				System.out.println("session is not closed");
			}				
			}
		}
	

	@Override
	public void updateDogEntity() {
		Session session=null;
		try {
		session=SessionFactoryProvider.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		DogEntity dogEntity=session.get(DogEntity.class, 4);
		dogEntity.setGender("Male");
		dogEntity.setColor("Black");
		session.update(dogEntity);
		System.out.println("Data Updated successfully"+dogEntity);
		transaction.commit();
		}catch (ObjectNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (HibernateException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(session!=null) {
			session.close();
				System.out.println("session is closed");
			}else {
				System.out.println("session is not closed");
			}
		}
	}

	@Override
	public void deleteDogEntity() {
		Session session=null;
		try {
		session=SessionFactoryProvider.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		DogEntity dogEntity=session.get(DogEntity.class, 7);
		session.delete(dogEntity);
		System.out.println("Data Deleted successfully"+dogEntity);
		transaction.commit();
		}catch (ObjectNotFoundException e) {
			System.out.println(e.getMessage());
		}catch (HibernateException e) {
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(session!=null) {
			session.close();
				System.out.println("session is closed");
			}else {
				System.out.println("session is not closed");
			}
		}
	}	
}
