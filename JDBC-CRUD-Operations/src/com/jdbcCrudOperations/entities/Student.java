package com.jdbcCrudOperations.entities;

public class Student {
	private int id;
	private int rollNumber;
	private String dateOfBirth;
	private String firstName;
	private String middleName;
	private String lastName;
	private String phoneNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Student(int id, int rollNumber, String dateOfBirth, String firstName, String middleName, String lastName,
			String phoneNumber) {
		super();
		this.id = id;
		this.rollNumber = rollNumber;
		this.dateOfBirth = dateOfBirth;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	public Student(int rollNumber, String dateOfBirth, String firstName, String middleName, String lastName,
			String phoneNumber) {
		super();
		this.rollNumber = rollNumber;
		this.dateOfBirth = dateOfBirth;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
