package com.dao.onetomanymapping;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.onetomanymapping.Address;

@Repository
public class AddressDAOImpl<T> implements AddressDAO<T> {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Address address) {
		sessionFactory.getCurrentSession().save(address);
	}
}
