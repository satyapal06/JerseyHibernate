package com.dao;

import java.util.List;

import com.entity.FirstEntity;

public interface FirstDAO<T> {
	public List<T> getAll();

	public void save(FirstEntity entity);
}
