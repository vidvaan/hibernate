package com.createiq.client;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.CriteriaBuilder.In;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.createiq.model.Employee;

public class FindAllDemo2 {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		// SQL : SELECT * FROM EMP_TAB WHERE EMP_NAME LIKE '%B%';

		// Criteria criteria = session.createCriteria(Employee.class);
		// //Criterion criterion = Restrictions.like("ename", "a", MatchMode.ANYWHERE);
		// //Criterion criterion = Restrictions.gt("esal", 2000.00);
		// criteria.add(Restrictions.like("ename", "a",
		// MatchMode.ANYWHERE)).add(Restrictions.gt("esal", 2000.00))
		// List<Employee> employees = criteria.list();

//		List<Employee> employees = session.createCriteria(Employee.class)
//				.add(Restrictions.like("ename", "B", MatchMode.ANYWHERE)).add(Restrictions.gt("esal", 2000)).list();
		
		
		// Get all columns from Table
		// SELECT * FROM EMP_TAB WHERE EID = 3
		
//		CriteriaBuilder builder = session.getCriteriaBuilder();
//		CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
//		Root<Employee> root = query.from(Employee.class);
//		query.select(root);
//		query.where(builder.equal(root.get("eid"), 3));
//	    Query<Employee> q=session.createQuery(query);
//        List<Employee> employees = q.list();
//		employees.forEach(System.out::println);
		
		
		//SELECT * FROM EMP_TAB;
//		CriteriaBuilder builder = session.getCriteriaBuilder();
//		CriteriaQuery<Employee> query = builder.createQuery(Employee.class);
//		Root<Employee> root = query.from(Employee.class);
//		query.select(root);
//		Query<Employee> q=session.createQuery(query);
//		List<Employee> employees = q.list();
//		employees.forEach(System.out::println);
		
		//SELECT EID FROM EMP_TAB;
//		CriteriaBuilder builder = session.getCriteriaBuilder();
//		CriteriaQuery<Integer> query = builder.createQuery(Integer.class);
//		Root<Employee> root = query.from(Employee.class);
//		query.select(root.get("eid"));
//		Query<Integer> q= session.createQuery(query);
//		List<Integer> employees = q.list();
//		employees.forEach(System.out::println);
		
		//SELECT EID,ENAME FROM EMP_TAB;
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Object[]> query = builder.createQuery(Object[].class);
		Root<Employee> root = query.from(Employee.class);
		query.multiselect(root.get("eid"),root.get("ename"));
		Query<Object[]> q= session.createQuery(query);
		List<Object[]> employees = q.list();
		employees.forEach(arr -> {
			System.out.println(arr[0]+" "+arr[1]);
		});
		System.out.println(session.isConnected());
	}
}
