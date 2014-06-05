package com.service.onetomanyselfjoin;

import java.util.List;

public interface LabourService<T> {

	public void createLabour();

	public List<T> list();

}
