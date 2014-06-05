package com.rest.onetomanyselfjoin;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.entity.onetomanyselfjoin.Labour;
import com.service.onetomanyselfjoin.LabourService;

@Path("/labour")
@Component
@Scope("request")
public class ManageLabour<T> {
	
	@Autowired
	private LabourService<Labour> service;
	
	protected static Logger log = Logger.getLogger(ManageLabour.class.getName());
	
	@GET
	@Produces("application/xml")
	@Path("list")
	public List<Labour> list() {
		return service.list();
	}
	
	@GET
	@Produces("application/xml")
	@Path("all")
	public Labours<Labour> getLabours() {
		List<Labour> list = service.list();
		Labours<Labour> labours = new Labours<Labour>();
		labours.setList(list);
		return labours;
	}
}