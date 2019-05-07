package com.flower.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Flower {

@Entity

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "user")
	@SequenceGenerator(name = "employee", sequenceName = "user_id_seq")
	private int UserId;

	@Column(columnDefinition = "VARCHAR(25)")
	private String flowerName;
	@Column(columnDefinition = "VARCHAR(40)")
	private String colour;
	@Column(columnDefinition = "VARCHAR(40)")
	private String type;
	@Column(columnDefinition = "NUMBER(7,2)")
	private int  cost;
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getFlowerName() {
		return flowerName;
	}
	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	}
}

