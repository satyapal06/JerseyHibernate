package com.service.onetomanymapping;

import java.util.List;

public interface EmployeeService<T> {

	public void save();

	public List<T> list();

}
