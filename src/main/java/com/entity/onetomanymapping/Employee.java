package com.entity.onetomanymapping;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@Entity
@Table(name = "employee")
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Employee implements Serializable {

	private static final long serialVersionUID = 5479727869188500435L;

	@Id
	@GeneratedValue
	@Column(name = "employee_id")
	private Long employeeId;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "cell_phone")
	private String cellphone;

	@ManyToOne
	@JoinColumn(name = "address_id")
	private Address address;

	@XmlElement(name = "address")
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
	}

	public Employee(String firstname, String lastname, String phone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.cellphone = phone;
	}

	@XmlElement(name = "employeeId")
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
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

	@XmlElement(name = "cellphone")
	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
}