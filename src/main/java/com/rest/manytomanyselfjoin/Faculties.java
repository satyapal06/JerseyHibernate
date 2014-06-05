package com.rest.manytomanyselfjoin;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Faculties<T> implements Serializable {

	private static final long serialVersionUID = 674101753501207443L;
	private List<T> list = null;

	@XmlElement(name = "faculty")
	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
}
