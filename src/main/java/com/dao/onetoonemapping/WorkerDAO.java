package com.dao.onetoonemapping;

import java.util.List;

import com.entity.onetoonemapping.Worker;

public interface WorkerDAO<T> {
	public void save(Worker worker);

	public List<T> getWorkers();
}
