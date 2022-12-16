package com.jdbcCrudOperations.services;

import java.util.Scanner;

import com.jdbcCrudOperations.dao.StudentDaoCreate;
import com.jdbcCrudOperations.entities.Student;

public class StudentServiceCreate {

	public void addStudent() {
		
		Student student=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rollNumber: ");
		student.setRollNumber(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter dateOfBirth: ");
		student.setDateOfBirth(sc.nextLine());
		System.out.println("Enter firstName: ");
		student.setFirstName(sc.nextLine());
		System.out.println("Enter middleName: ");
		student.setMiddleName(sc.nextLine());
		System.out.println("Enter lastName: ");
		student.setLastName(sc.nextLine());
		System.out.println("Enter phoneNumber: ");
		student.setPhoneNumber(sc.nextLine());
		
		StudentDaoCreate sdc=new StudentDaoCreate();
		
		if(sdc.addStudent(student)) {
			System.out.println("Successfully added a student");
		}else {
			System.out.println("Something went wrong");
		}
		
		System.out.println("\n\n----------------------------------------------");
	}

	

}
