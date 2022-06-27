package com.xworkz.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.xworkz.entity.MobileEntity;

public class MobileDAOImplSQL implements MobileDAO {
	

	@Override
	public void addMobiles() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getMobile() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateByName(String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteByName(MobileEntity mobileEntity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getMobileDetails() {
		// TODO Auto-generated method stub

	}

	@Override
	public void countMobiles() {
		// TODO Auto-generated method stub

	}

	@Override
	public void minBatteryCapacity() {
		// TODO Auto-generated method stub

	}

	@Override
	public void maxMemory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void avgMobId() {
		// TODO Auto-generated method stub

	}

	@Override
	public void secondHighestMemrory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateByMemory(String memory, String BatteryCapacity) {
		try (Session session = MobileDAOImpl.buildSessionFactory.openSession();) {
			Transaction transaction = session.beginTransaction();
			Query query = session.createSQLQuery("update mobile_details set MEMORY=:x where BATTERYCAPACITY=:y");
			query.setParameter("x", memory);
			query.setParameter("y", BatteryCapacity);
			int update = query.executeUpdate();
			System.out.println("SQL query is executed----- " + update + " row affected");
			transaction.commit();

		}
	}

}
