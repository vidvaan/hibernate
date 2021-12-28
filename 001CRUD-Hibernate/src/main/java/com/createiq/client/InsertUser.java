package com.createiq.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.createiq.model.User;

public class InsertUser {
	
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		User user = new User();
		user.setUid(1001);
		user.setUname("Raju");
		user.setUage(29);
		session.save(user);
		session.beginTransaction().commit();
		session.close();
	}

}
