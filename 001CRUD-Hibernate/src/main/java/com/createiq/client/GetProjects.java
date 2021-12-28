package com.createiq.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.createiq.model.Department;
import com.createiq.model.Employee;
import com.createiq.model.Project;

public class GetProjects {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		
		Project project = session.get(Project.class, 1);
		
		System.out.println(project.getEmployees());
		
		session.beginTransaction().commit();
		session.close();
	}
}
