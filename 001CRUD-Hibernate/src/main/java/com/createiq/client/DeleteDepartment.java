package com.createiq.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.createiq.model.Address;
import com.createiq.model.Department;
import com.createiq.model.Employee;
import com.createiq.model.Project;

public class DeleteDepartment {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		Department d1 = session.get(Department.class, 1);
         session.delete(d1);
		transaction.commit();
		session.close();

		System.out.println(session.isConnected());
	}

}
