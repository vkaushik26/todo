package com.todo.application.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class TodoItem {

	private Long id;
	@NotNull
	private String first_name;
	private String last_name;

	public TodoItem(Long id, String first_name, String last_name, String country, String phoneNo) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.country = country;
		PhoneNo = phoneNo;
	}

	@Id
	@GeneratedValue

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}

	private String country;
	private String PhoneNo;

	public TodoItem() {
	}

}
