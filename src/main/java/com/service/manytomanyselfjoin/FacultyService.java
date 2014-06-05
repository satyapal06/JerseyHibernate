package com.service.manytomanyselfjoin;

import java.util.List;

public interface FacultyService<T> {

	public List<T> list();

	public void createFaculty();
}
