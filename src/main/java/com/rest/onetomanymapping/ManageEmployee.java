package com.rest.onetomanymapping;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.entity.onetomanymapping.Employee;
import com.service.onetomanymapping.EmployeeService;

@Path("/employees")
@Component
@Scope("request")
public class ManageEmployee<T> {

	@Autowired
	private EmployeeService<Employee> service;
	
	protected static Logger log = Logger.getLogger(ManageEmployee.class.getName());
	
	@GET
	@Produces("application/xml")
	@Path("list")
	public List<Employee> list() {
		return service.list();
	}
	
	@GET
	@Produces("application/xml")
	@Path("all")
	public Employees<Employee> getEmployees() {
		List<Employee> list = service.list();
		Employees<Employee> employees = new Employees<Employee>();
		employees.setList(list);
		return employees;
	}
}