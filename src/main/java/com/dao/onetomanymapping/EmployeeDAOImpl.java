package com.dao.onetomanymapping;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.onetomanymapping.Employee;

@Repository
public class EmployeeDAOImpl<T> implements EmployeeDAO<T> {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Employee e) {
		sessionFactory.getCurrentSession().save(e);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> list() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class);
		return criteria.list();
	}
}
