package com.capgemini.entity;


import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class University implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String universityName;
	private String universityAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private Department department;
	public University() {
		super();
	}
	public University(Integer id, String universityName, String universityAddress, Department department) {
		super();
		this.id = id;
		this.universityName = universityName;
		this.universityAddress = universityAddress;
		this.department = department;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getUniversityAddress() {
		return universityAddress;
	}
	public void setUniversityAddress(String universityAddress) {
		this.universityAddress = universityAddress;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "University [id=" + id + ", universityName=" + universityName + ", universityAddress="
				+ universityAddress + ", department=" + department + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(department, id, universityAddress, universityName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		University other = (University) obj;
		return Objects.equals(department, other.department) && Objects.equals(id, other.id)
				&& Objects.equals(universityAddress, other.universityAddress)
				&& Objects.equals(universityName, other.universityName);
	}
}