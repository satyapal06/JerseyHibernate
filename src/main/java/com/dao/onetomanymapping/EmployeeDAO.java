package com.dao.onetomanymapping;

import java.util.List;

import com.entity.onetomanymapping.Employee;

public interface EmployeeDAO<T> {

	public void save(Employee e);

	public List<T> list();
	
}
