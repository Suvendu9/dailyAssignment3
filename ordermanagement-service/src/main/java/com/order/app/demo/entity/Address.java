package com.order.app.demo.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Address {
	@Min(value = 6, message = "pincode must be 6 digits")
	private int pincode;
	@NotBlank
	private String city;

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	private String country;
}
