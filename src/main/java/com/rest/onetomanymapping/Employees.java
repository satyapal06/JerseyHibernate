package com.rest.onetomanymapping;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employees<T> implements Serializable {
	private static final long serialVersionUID = 5126407625755375731L;
	private List<T> list = null;

	@XmlElement(name = "employee")
	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
}