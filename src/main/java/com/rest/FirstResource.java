package com.rest;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.entity.FirstEntity;
import com.service.FirstService;

@Path("/entities")
@Component
@Scope("request")
public class FirstResource<T> {
	
	@Autowired
	private FirstService<FirstEntity> service;

	protected static Logger log = Logger.getLogger(FirstResource.class.getName());

	@GET
	@Produces("application/xml")
	@Path("demo")
	public List<FirstEntity> getEntities() {
		return service.getEntities();
	}
}
