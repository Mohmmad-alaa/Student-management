package com.zabdwi.api;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Student {

	private int id;
	
	
	@NotBlank(message = "Your Name can't be blank")	
	private String name;

	
	@NotBlank(message = "Your Country can't be blank")	
	private String country;
	
	
	@NotNull(message = "Your Mobile can't be blank")
	private Long mobile;
	
	private Date dob;
	
	private String gender;
	
	private String blood_group;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", country=" + country + ", mobile=" + mobile + ", dob=" + dob
				+ ", gender=" + gender + ", blood_group=" + blood_group + "]";
	}

	
	

}
