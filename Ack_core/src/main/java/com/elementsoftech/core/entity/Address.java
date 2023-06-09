package com.elementsoftech.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String address1;
	private String adderss2;
	private String city;
	private String state;
	private String postalcode;
	
	public Address(Long id, String address1, String adderss2, String city, String state, String postalcode) {
		super();
		this.id = id;
		this.address1 = address1;
		this.adderss2 = adderss2;
		this.city = city;
		this.state = state;
		this.postalcode = postalcode;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", address1=" + address1 + ", adderss2=" + adderss2 + ", city=" + city + ", state="
				+ state + ", postalcode=" + postalcode + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAdderss2() {
		return adderss2;
	}

	public void setAdderss2(String adderss2) {
		this.adderss2 = adderss2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	
	

}
