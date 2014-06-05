package com.rest.onetoonemapping;

import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.entity.onetoonemapping.Worker;
import com.service.onetoonemapping.WorkerService;

@Path("/workers")
@Component
@Scope("request")
public class WorkerManager<T> {

	@Autowired
	private WorkerService<Worker> workerService;
	
	protected static Logger log = Logger.getLogger(WorkerManager.class.getName());

	@GET
	@Produces("application/xml")
	@Path("all")
	public Workers<Worker> getEntities() {
		workerService.save();
		List<Worker> list = workerService.getWorkers();
		Workers<Worker> ws = new Workers<Worker>();
		ws.setList(list);
		return ws;
	}
	
	@GET
	@Produces("application/xml")
	@Path("list")
	public List<Worker> list() {
		List<Worker> list = workerService.getWorkers();
		return list;
	}
}
