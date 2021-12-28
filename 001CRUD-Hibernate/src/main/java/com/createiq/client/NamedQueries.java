package com.createiq.client;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.createiq.model.Employee;

public class NamedQueries {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();

//		Query<Employee> allEmps = session.createNamedQuery("emp_find_all");
//		allEmps.list().forEach(System.out::println);
		System.out.println("---------------------------------------------------");
		BigInteger result = (BigInteger) session.createNamedQuery("emp_count_all").getSingleResult();
		System.out.println("Count : "+result);

		session.close();
	}
}
