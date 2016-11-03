package com.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import org.springframework.data.annotation.Id;


@Document
public class Person {
	
	public Person(Date userDate, String firstName, String lastName) {
		this.userDate = userDate;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Id
	private String Id;
	
	@Indexed
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@Field("d")
	private Date userDate;
	
	@Indexed
	@Field("f")
	private String firstName;
	
	@Indexed
	@Field("l")
	private String lastName;
	
	

	public Date getUserDate() {
		return userDate;
	}

	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
