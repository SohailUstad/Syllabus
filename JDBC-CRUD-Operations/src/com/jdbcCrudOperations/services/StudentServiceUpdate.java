package com.jdbcCrudOperations.services;

import java.util.Scanner;

import com.jdbcCrudOperations.dao.StudentDaoRead;
import com.jdbcCrudOperations.dao.StudentDaoUpdate;
import com.jdbcCrudOperations.entities.Student;

public class StudentServiceUpdate {
	
	public void updateAllDetailsOfStudentById() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student Id: ");
		int id=sc.nextInt();
		sc.nextLine();
		Student oldStudent=new StudentDaoRead().getStudentById(id);
		Student newStuden=new Student();
		System.out.println("Enter details you want to update: ");
		System.out.println("-------------------------------------");
		
		System.out.println("Old rollnumber: "+oldStudent.getRollNumber());
		System.out.println("Enter new Roll number: ");
		newStuden.setRollNumber(sc.nextInt());sc.nextLine();
		
		System.out.println("Old date of birth: "+oldStudent.getDateOfBirth());
		System.out.println("Enter new date of birth: ");
		newStuden.setDateOfBirth(sc.nextLine());
		
		System.out.println("Old first name: "+oldStudent.getFirstName());
		System.out.println("Enter new first name: ");
		newStuden.setFirstName(sc.nextLine());
		
		System.out.println("Old middle name: "+oldStudent.getMiddleName());
		System.out.println("Enter new middle name: ");
		newStuden.setMiddleName(sc.nextLine());
		
		System.out.println("Old last name: "+oldStudent.getLastName());
		System.out.println("Enter new last name: ");
		newStuden.setLastName(sc.nextLine());
		
		System.out.println("Old phone number: "+oldStudent.getPhoneNumber());
		System.out.println("Enter new phone number: ");
		newStuden.setPhoneNumber(sc.nextLine());
		
		StudentDaoUpdate sdu=new StudentDaoUpdate();
		if(sdu.updateAllDetailsOfStudentById(id, newStuden)) {
			System.out.println("Successfully updated");
		}else {
			System.out.println("Failed");
		}
		
		
		System.out.println("\n\n----------------------------------------------");
	}
	
}
