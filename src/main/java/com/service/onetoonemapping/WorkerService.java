package com.service.onetoonemapping;

import java.util.List;

public interface WorkerService<T> {
	public void save();

	public List<T> getWorkers();
}
