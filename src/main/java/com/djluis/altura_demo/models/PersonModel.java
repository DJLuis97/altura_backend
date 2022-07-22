package com.djluis.altura_demo.models;

import javax.persistence.*;

@Entity
@Table(name = "people")
public class PersonModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;

	private String name, last_name;

	public void setId (Long id) {
		this.id = id;
	}

	public Long getId () {
		return this.id;
	}

	public void setName (String name) {
		this.name = name;
	}

	public String getName () {
		return this.name;
	}

	public void setLastName (String last_name) {
		this.last_name = last_name;
	}

	public String getLastName () {
		return this.last_name;
	}
}