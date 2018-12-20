package com.margo.immo.backend.immomodels;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adresses")
public class Adress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String id;
	Integer streetNumber;
	String streetName;
	Integer postalCode;
	String city;
	String additional;

	public Integer getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(Integer streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public Integer getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(Integer postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAdditional() {
		return additional;
	}

	public void setAdditional(String additional) {
		this.additional = additional;
	}

	@Override
	public String toString() {
		return "Adress [id=" + id + ", streetNumber=" + streetNumber + ", streetName=" + streetName + ", postalCode="
				+ postalCode + ", city=" + city + ", additional=" + additional + "]";
	}

}
