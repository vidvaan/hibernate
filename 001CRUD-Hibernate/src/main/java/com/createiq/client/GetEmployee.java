package com.createiq.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.createiq.model.Department;
import com.createiq.model.Employee;

public class GetEmployee {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		
		Employee employee = session.get(Employee.class, 1);
		
		System.out.println(employee.getDepartment());
		
		session.beginTransaction().commit();
		session.close();
	}
}
