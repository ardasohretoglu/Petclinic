package com.javaegitimleri.petclinic.model;

import java.util.HashSet;
import java.util.Set;

public class Owner {
	
	private long id;
	private String firstName;
	private String lastName;
	
	private Set<Pet> Pets = new HashSet<>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Set<Pet> getPets() {
		return Pets;
	}

	public void setPets(Set<Pet> pets) {
		Pets = pets;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	
}
