package com.createiq.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.createiq.model.Employee;

public class HqlDemo {
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		//SQL : SELECT * FROM EMP_TAB e INNER JOIN Dept_tab d ON e.dept_id = d.dept_id WHERE d.dept_id = 1;
		//HQL : from Employee e inner join Department d on e.did = d.did where d.did = 1;
		
		String hqlQuery = "from Employee e where e.department.did = :did";
		
		Query<Employee> query = session.createQuery(hqlQuery);
		query.setParameter("did", 1);
		List<Employee> employees = query.list();
		//Jdk 1.5
//		for (Object[] arr : employees) {
//			System.out.println(arr[0]+" "+arr[1]);
//		}
		
		//Jdk 1.8
		
		employees.forEach(System.out::println);
		
	}

}
