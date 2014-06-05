package com.entity.onetoonemapping;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "worker")
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Worker implements Serializable{
	
	private static final long serialVersionUID = 961904237253667127L;

	@Id
	@GeneratedValue
	@Column(name = "worker_id")
	private Long workerId;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "birth_date")
	private Date birthDate;

	@Column(name = "cell_phone")
	private String cellphone;

	@OneToOne(mappedBy = "worker", cascade = CascadeType.ALL)
	private WorkerDetail workerDetail;

	public Worker() {

	}

	public Worker(String firstname, String lastname, Date birthdate,
			String phone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthdate;
		this.cellphone = phone;

	}

	@XmlElement(name = "workerId")
	public Long getWorkerId() {
		return workerId;
	}

	public void setWorkerId(Long workerId) {
		this.workerId = workerId;
	}

	@XmlElement(name = "firstname")
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@XmlElement(name = "lastname")
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@XmlElement(name = "birthDate")
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@XmlElement(name = "cellphone")
	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	@XmlElement(name = "workerDetail")
	public WorkerDetail getWorkerDetail() {
		return workerDetail;
	}

	public void setWorkerDetail(WorkerDetail workerDetail) {
		this.workerDetail = workerDetail;
	}
}