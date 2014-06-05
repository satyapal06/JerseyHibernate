package com.service.onetoonemapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.onetoonemapping.WorkerDAO;
import com.entity.onetoonemapping.Worker;
import com.entity.onetoonemapping.WorkerDetail;

@Service
public class WorkerServiceImpl<T> implements WorkerService<T> {

	@Autowired
	private WorkerDAO<T> workerDAO;
	
	@Transactional
	public void save() {
		WorkerDetail workerDetail = new WorkerDetail("Lake Town", "Kolkata",
				"West Bengal", "India");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dob = null;
		try {
			dob = sdf.parse("1987-05-21");
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Worker worker = new Worker("Sushmita", "Dasgupta", dob, "919595959595");
		worker.setWorkerDetail(workerDetail);
		workerDetail.setWorker(worker);
		workerDAO.save(worker);
	}

	@Transactional
	public List<T> getWorkers() {
		return workerDAO.getWorkers();
	}
}