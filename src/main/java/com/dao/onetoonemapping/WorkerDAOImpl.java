package com.dao.onetoonemapping;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.onetoonemapping.Worker;

@Repository
public class WorkerDAOImpl<T> implements WorkerDAO<T> {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Worker worker) {
		sessionFactory.getCurrentSession().save(worker);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getWorkers() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Worker.class);
		return criteria.list();
	}
}