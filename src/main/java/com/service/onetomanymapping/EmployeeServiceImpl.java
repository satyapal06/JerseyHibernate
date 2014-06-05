package com.service.onetomanymapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.onetomanymapping.AddressDAO;
import com.dao.onetomanymapping.EmployeeDAO;
import com.entity.onetomanymapping.Address;
import com.entity.onetomanymapping.Employee;

@Service
public class EmployeeServiceImpl<T> implements EmployeeService<T> {

	@Autowired
	private AddressDAO<Address> addressDAO;
	
	@Autowired
	private EmployeeDAO<T> employeeDAO;
	
	@Transactional
	public void save() {
		Address address = new Address();
		address.setStreet("sindhiya street");
		address.setCity("Gwalior");
		address.setState("Madhya Pradesh");
		address.setCountry("India");
		addressDAO.save(address);
		
		Employee e1 = new Employee("Ankit", "Sharma", "9999999999");
		Employee e2 = new Employee("Ankit", "Kaushal", "3333333333");

		e1.setAddress(address);
		e2.setAddress(address);
		employeeDAO.save(e1);
		employeeDAO.save(e2);
	}

	@Transactional
	public List<T> list() {
		return employeeDAO.list();
	}
}
