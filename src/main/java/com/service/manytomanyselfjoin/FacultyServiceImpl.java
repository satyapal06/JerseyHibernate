package com.service.manytomanyselfjoin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.manytomanyselfjoin.FacultyDAO;
import com.entity.manytomanyselfjoin.Faculty;

@Service
public class FacultyServiceImpl<T> implements FacultyService<T> {

	@Autowired
	private FacultyDAO<T> facultyDAO;
	
	@Transactional
	public List<T> list() {
		return facultyDAO.list();
	}

	@Transactional
	public void createFaculty() {
		Faculty f1=new Faculty("Sachin","singh");
		Faculty f2=new Faculty("Anirrudh","patel");
		Faculty f3=new Faculty("Jane","patel");
		Faculty f4=new Faculty("Rosini","Sharma");
		Faculty f5=new Faculty("Rakesh","Chowdhary");

		f1.getCoworkers().add(f2);
		f1.getCoworkers().add(f3);
		f2.getCoworkers().add(f1);
		f2.getCoworkers().add(f3);
		f3.getCoworkers().add(f1);
		f3.getCoworkers().add(f2);
		f4.getCoworkers().add(f5);
		f5.getCoworkers().add(f4);

		facultyDAO.save(f1);
		facultyDAO.save(f2);
		facultyDAO.save(f3);
		facultyDAO.save(f4);
		facultyDAO.save(f5);

	}
}