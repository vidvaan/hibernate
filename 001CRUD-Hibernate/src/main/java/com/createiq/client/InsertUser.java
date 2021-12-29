package com.createiq.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.createiq.model.User;
import com.createiq.model.User_PK;

public class InsertUser {
	
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
//		User user = new User();
//		user.setFname("Balaji");
//		user.setLname("T");
//		user.setUage(29);
//		session.save(user);
		
		User_PK userPK = new User_PK("Balaji","G");
		
		System.out.println(session.get(User.class, userPK));
		
		session.beginTransaction().commit();
		session.close();
	}

}
