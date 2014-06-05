package com.dao.manytomanyselfjoin;

import java.util.List;

import com.entity.manytomanyselfjoin.Faculty;

public interface FacultyDAO<T> {

	public void save(Faculty f);

	public List<T> list();

}
