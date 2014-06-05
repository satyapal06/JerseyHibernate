package com.dao.manytomanyselfjoin;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.manytomanyselfjoin.Faculty;

@Repository
public class FacultyDAOImpl<T> implements FacultyDAO<T> {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Faculty f) {
		sessionFactory.getCurrentSession().save(f);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> list() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Faculty.class);
		return criteria.list();
	}
}