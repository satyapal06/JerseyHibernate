package com.service;

import java.util.List;

public interface FirstService<T> {

	public String getView();

	public List<T> getEntities();
}
