package com.jdbcCrudOperations.services;

import java.util.Scanner;

import com.jdbcCrudOperations.dao.StudentDaoDelete;

public class StudentServiceDelete {
	
	public void deleteStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student's id you want to delete: ");
		int id=sc.nextInt();sc.nextLine();
		StudentDaoDelete sdd=new StudentDaoDelete();
		if(sdd.deleteStudent(id)) {
			System.out.println("Student deleted successfully");
		}else {
			System.out.println("Something went wrong");
		}
		
		System.out.println("\n\n----------------------------------------------");
	}
	
}
