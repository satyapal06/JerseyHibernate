package com.entity.onetomanyselfjoin;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "labour")
@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class Labour implements Serializable {

	private static final long serialVersionUID = 1948527523114429940L;

	@Id
	@Column(name = "labour_id")
	@GeneratedValue
	private Long labourId;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "contractor_id")
	private Labour contractor;

	@OneToMany(mappedBy = "contractor", fetch=FetchType.EAGER)
	private Set<Labour> subordinates = new HashSet<Labour>();

	public Labour() {
	}
	
	public Labour(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@XmlElement(name = "labourId")
	public Long getLabourId() {
		return labourId;
	}

	public void setLabourId(Long labourId) {
		this.labourId = labourId;
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

	public Labour getContractor() {
		return contractor;
	}

	public void setContractor(Labour contractor) {
		this.contractor = contractor;
	}

	@XmlElement(name = "subordinates")
	public Set<Labour> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(Set<Labour> subordinates) {
		this.subordinates = subordinates;
	}
}