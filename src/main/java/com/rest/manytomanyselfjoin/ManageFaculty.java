package com.rest.manytomanyselfjoin;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.entity.manytomanyselfjoin.Faculty;
import com.service.manytomanyselfjoin.FacultyService;

@Path("/faculty")
@Component
@Scope("request")
public class ManageFaculty<T> {

	@Autowired
	private FacultyService<Faculty> service;

	protected static Logger log = Logger.getLogger(ManageFaculty.class.getName());

	@GET
	@Produces("application/xml")
	@Path("list")
	public List<Faculty> list() {
		return service.list();
	}

	@GET
	@Produces("application/xml")
	@Path("all")
	public Faculties<Faculty> getEmployees() {
		List<Faculty> list = service.list();
		Faculties<Faculty> faculties = new Faculties<Faculty>();
		faculties.setList(list);
		return faculties;
	}
}
