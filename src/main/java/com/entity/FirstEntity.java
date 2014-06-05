package com.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="firstentity")
@XmlRootElement
public class FirstEntity implements Serializable {

	private static final long serialVersionUID = -1895024681388455444L;
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private long id;
	 private String fullName;
	 private String address1;
	 private String address2;
	 private String city;
	 private String zipCode;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	@Override
	public String toString() {
		return "FirstEntity [id=" + id + ", fullName=" + fullName
				+ ", address1=" + address1 + ", address2=" + address2
				+ ", city=" + city + ", zipCode=" + zipCode + "]";
	}
}	