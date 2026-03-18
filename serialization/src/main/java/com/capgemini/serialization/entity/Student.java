package com.capgemini.serialization.entity;


import java.io.Serializable;

public class Student implements Serializable {
	private Integer id;
	private String name;
	private String mailId;
	private long contactNumber;

	public Student() {
	}

	public Student(Integer id, String name, String mailId, long contactNumber) {
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contactNumber = contactNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Student{id=" + id + ", name=" + name + ", mailId=" + mailId + ", contactNumber=" + contactNumber + "}";
	}
}