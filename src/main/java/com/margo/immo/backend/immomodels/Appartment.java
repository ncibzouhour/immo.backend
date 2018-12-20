package com.margo.immo.backend.immomodels;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appartements")
public class Appartment implements IProperty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String id;
	Integer number;
	String descrption;
	String type;
	Float surface;
	Integer floor;
	Adress adress;

	public Appartment(String id, Integer number, String descrption, String type, Float surface, Integer floor,	Adress adress) {
		super();
		this.id = id;
		this.number = number;
		this.descrption = descrption;
		this.type = type;
		this.surface = surface;
		this.adress=adress;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Float getSurface() {
		return surface;
	}

	public void setSurface(Float surface) {
		this.surface = surface;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return "Appartment [id=" + id + ", number=" + number + ", descrption=" + descrption + ", type=" + type
				+ ", surface=" + surface + ", floor=" + floor + ", adress=" + adress + "]";
	}

	
	}

}
