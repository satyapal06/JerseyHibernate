package com.service.onetomanyselfjoin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.onetomanyselfjoin.LabourDAO;
import com.entity.onetomanyselfjoin.Labour;

@Service
public class LabourServiceImpl<T> implements LabourService<T> {

	@Autowired
	private LabourDAO<T> labourDAO;
	
	@Transactional
	public void createLabour() {
		Labour contractor = new Labour("Abay", "Singh");
		Labour labour1 = new Labour("Shambhu", "Dayal");
		Labour labour2 = new Labour("Ram", "Narayan");
		labour1.setContractor(contractor);
		labour2.setContractor(contractor);
		labourDAO.save(labour1);
		labourDAO.save(labour2);
	}

	@Transactional
	public List<T> list() {
		return labourDAO.list();
	}
}
