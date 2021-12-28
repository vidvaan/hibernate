package com.createiq.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.createiq.model.Employee;

public class FindAllDemo {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		//SQL : SELECT * FROM EMP_TAB;
		//HQL : from Employee;
		
		String hqlQuery = "from Employee";
		
		Query<Employee> query = session.createQuery(hqlQuery);
		List<Employee> employees = query.list();
		//Jdk 1.5
//		for (Object[] arr : employees) {
//			System.out.println(arr[0]+" "+arr[1]);
//		}
		
		//Jdk 1.8
		
		employees.forEach(System.out::println);
		
		
//		employees.forEach(
//				arr -> {
//					System.out.println(arr[0]+" "+arr[1]);
//				});
		session.close();
		
		System.out.println(session.isConnected());
	}
}
