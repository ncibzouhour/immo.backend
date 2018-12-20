package com.margo.immo.backend.immomodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "buildings")
public class Building implements IProperty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String id;
	@OneToOne
	Adress adress;
	@OneToMany
	List<Appartment> appartments;

	public Building(String id, Adress adress, Appartment... appartments) {
		super();
		this.id = id;
		this.adress = adress;
		this.appartments = new ArrayList<Appartment>(Arrays.asList(appartments));
	}

	public Building(String id, Adress adress) {
		super();
		this.id = id;
		this.adress = adress;
		this.appartments = new ArrayList<Appartment>();

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Appartment> getAppartments() {
		return appartments;
	}

	public void setFloors(List<Appartment> appartments) {
		this.appartments = appartments;
	}

	public void addFloors(Appartment appartment) {
		this.appartments.add(appartment);
	}

	@Override
	public String toString() {
		return "Building [id=" + id + ", adress=" + adress + ", appartments=" + appartments + "]";
	}

}
