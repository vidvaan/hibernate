package com.createiq.client;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.type.DoubleType;
import org.hibernate.type.StringType;

import com.createiq.model.Employee;

public class BulkDeleteDemo {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		//SQL : delete from emp_tab where emp_name = 'ram';
		//HQL : delete from Employee where ename = ?
		
		String hqlQuery = "delete from Employee where ename = :name";
		session.beginTransaction();
		Query query = session.createQuery(hqlQuery);
		query.setParameter("name", "ram");
		query.executeUpdate();
		System.out.println("Delete Done! ");
		
		session.getTransaction().commit();
		
		
//		NativeQuery<Object[]> query2 = session.createNativeQuery("SELECT * FROM EMP_TAB");
//		List<Object[]> emps = query2.list();
		
		List<Employee> emps = session.createNativeQuery("SELECT * FROM EMP_TAB",Employee.class)
				
				.list();
		
		emps.forEach(System.out::println);
	
		System.out.println(session.isConnected());
	}
}
