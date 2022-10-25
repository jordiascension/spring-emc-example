package com.emc.presentation.entity;

public class Student {

	private int id;
	private String name;
	private String surname;
	private String direction;

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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Student() {

	}

	public Student(int id, String name, String surname, String direction) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.direction = direction;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", direction=");
		builder.append(direction);
		builder.append("]");
		return builder.toString();
	}

}
