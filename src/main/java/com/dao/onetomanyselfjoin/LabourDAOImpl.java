package com.dao.onetomanyselfjoin;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.onetomanyselfjoin.Labour;


@Repository
public class LabourDAOImpl<T> implements LabourDAO<T> {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Labour labour) {
		sessionFactory.getCurrentSession().save(labour);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> list() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Labour.class);
		return criteria.list();
	}
}
