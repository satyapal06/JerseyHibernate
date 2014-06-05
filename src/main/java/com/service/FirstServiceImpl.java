package com.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.FirstDAO;
import com.entity.FirstEntity;

@Service
public class FirstServiceImpl<T> implements FirstService<T> {

	protected static Logger log = Logger.getLogger(FirstServiceImpl.class.getName());
	
	@Autowired
	private FirstDAO<T> firstDAO;
	
	@Transactional
	public String getView() {
		FirstEntity entity = new FirstEntity();
		entity.setFullName("Satya Pal Singh");
		entity.setCity("New Delhi");
		entity.setZipCode("110091");
		entity.setAddress1("189/1 Patpar Ganj Village Area");
		entity.setAddress2("Mayur Vihar Phase - 1");
		firstDAO.save(entity);
		return "hello";
	}

	@Transactional
	public List<T> getEntities() {
		return firstDAO.getAll();
	}
}