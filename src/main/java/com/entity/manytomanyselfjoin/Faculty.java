package com.entity.manytomanyselfjoin;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="faculty")
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Faculty implements Serializable {

	private static final long serialVersionUID = -3264031231864285869L;

	@Id
	@Column(name = "faculty_id")
	@GeneratedValue
	private Long facultyId;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "faculty_coworker", joinColumns = { @JoinColumn(name = "faculty_id") }, inverseJoinColumns = { @JoinColumn(name = "coworker_id") })
	private Set<Faculty> coworkers = new HashSet<Faculty>();

	@ManyToMany(mappedBy = "coworkers", fetch=FetchType.EAGER)
	private Set<Faculty> colleagues = new HashSet<Faculty>();

	public Faculty() {
	}
	
	public Faculty(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@XmlElement(name = "facultyId")
	public Long getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Long facultyId) {
		this.facultyId = facultyId;
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

	public Set<Faculty> getCoworkers() {
		return coworkers;
	}

	public void setCoworkers(Set<Faculty> coworkers) {
		this.coworkers = coworkers;
	}

	public Set<Faculty> getColleagues() {
		return colleagues;
	}

	public void setColleagues(Set<Faculty> colleagues) {
		this.colleagues = colleagues;
	}
}