package com.jdbcCrudOperations.services;

import com.jdbcCrudOperations.dao.StudentDaoRead;
import com.jdbcCrudOperations.entities.Student;

public class StudentServiceRead {

	public void listAllStudents() {
		StudentDaoRead sdr=new StudentDaoRead();
		for(Student s:sdr.listAllStudents()) {
			System.out.println("Id: "+s.getId());
			System.out.println("Roll Number: "+s.getRollNumber());
			System.out.println("Date Of Birth: "+s.getDateOfBirth());
			System.out.println("First Name: "+s.getFirstName());
			System.out.println("Middle Name: "+s.getMiddleName());
			System.out.println("Last Name: "+s.getLastName());
			System.out.println("Phone Number: "+s.getPhoneNumber());
			System.out.println("---------------------------------------");
		}
		System.out.println("\n\n----------------------------------------------");
	}

}
