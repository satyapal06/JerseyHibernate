package com.dao.onetomanyselfjoin;

import java.util.List;

import com.entity.onetomanyselfjoin.Labour;

public interface LabourDAO<T> {
	public void save(Labour labour);

	public List<T> list();
}
