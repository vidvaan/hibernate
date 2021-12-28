package com.createiq.client;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.createiq.model.Address;
import com.createiq.model.Department;
import com.createiq.model.Employee;

public class InsertEmployee {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		Department d1 = new Department();
		d1.setDname("IT");
		d1.setDloc("HYD");

		Department d2 = new Department();
		d2.setDname("OPS");
		d2.setDloc("BAN");

		Employee e1 = new Employee();
		e1.setEname("Balaji");
		e1.setEsal(23000.00);
		e1.setAddress(new Address(0, "SKLM", "999515258", "test@gmail.com"));
		e1.setDepartment(d1);

		Employee e2 = new Employee();
		e2.setEname("Raja");
		e2.setEsal(22000.00);
		e2.setAddress(new Address(0, "VSKP", "999515259", "test1@gmail.com"));
		e2.setDepartment(d1);

		Employee e3 = new Employee();
		e3.setEname("Rani");
		e3.setEsal(22000.00);
		e3.setAddress(new Address(0, "VZM", "999515859", "test1@gmail.com"));
		e3.setDepartment(d1);

		List<Employee> employees1 = Arrays.asList(new Employee[] { e1, e2, e3 });

		Employee e4 = new Employee();
		e4.setEname("Ram");
		e4.setEsal(23000.00);
		e4.setAddress(new Address(0, "TG", "899515259", "test1@gmail.com"));
		e4.setDepartment(d2);

		Employee e5 = new Employee();
		e5.setEname("Roy");
		e5.setEsal(22000.00);
		e5.setAddress(new Address(0, "WGL", "799515259", "test1@gmail.com"));
		e5.setDepartment(d2);
		List<Employee> employees2 = Arrays.asList(new Employee[] { e4, e5 });

		d1.setEmployees(employees1);
		d2.setEmployees(employees2);
		
		
//		session.save(e1);
//		session.save(e2);
//		session.save(e3);
//		session.save(e4);
//		session.save(e5);
		
		session.save(d1);
		session.save(d2);

		transaction.commit();
		session.close();

		System.out.println(session.isConnected());
	}

}
