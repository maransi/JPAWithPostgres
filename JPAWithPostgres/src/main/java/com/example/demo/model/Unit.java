package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Unit {
	
	@Id
//	@GeneratedValue( strategy = GenerationType.SEQUENCE , generator="unit_sequence")
//	@SequenceGenerator(name="unit_sequence", sequenceName="unit_seq" ,initialValue = 1, allocationSize = 1)
	@GeneratedValue( strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Unit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Unit(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "\nUnit [id=" + id + ", name=" + name + "]";
	}
	

	
}
