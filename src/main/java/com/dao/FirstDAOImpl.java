package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.FirstEntity;

@Repository
public class FirstDAOImpl<T> implements FirstDAO<T> {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(FirstEntity.class);
		return criteria.list();
	}

	@Override
	public void save(FirstEntity entity) {
		sessionFactory.getCurrentSession().save(entity);
	}
}
