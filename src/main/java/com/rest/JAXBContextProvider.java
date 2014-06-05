/**
 * 
 */
package com.rest;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.springframework.stereotype.Component;

import com.entity.FirstEntity;
import com.entity.manytomanyselfjoin.Faculty;
import com.entity.onetomanymapping.Address;
import com.entity.onetomanymapping.Employee;
import com.entity.onetomanyselfjoin.Labour;
import com.entity.onetoonemapping.Worker;
import com.entity.onetoonemapping.WorkerDetail;
import com.rest.manytomanyselfjoin.Faculties;
import com.rest.onetomanymapping.Employees;
import com.rest.onetomanyselfjoin.Labours;
import com.rest.onetoonemapping.Workers;

/**
 * @author satyapal
 * 
 */
@Component
@Provider
public class JAXBContextProvider implements ContextResolver<JAXBContext> {

	private JAXBContext context = null;

	public JAXBContext getContext(Class<?> type) {
		try {
			context = JAXBContext.newInstance(FirstEntity.class, Workers.class,
					Worker.class, WorkerDetail.class, Employee.class,
					Address.class, Employees.class, Labour.class,
					Labours.class, Faculty.class, Faculties.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return context;
	}
}