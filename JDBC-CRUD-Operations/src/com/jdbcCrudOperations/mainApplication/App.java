package com.jdbcCrudOperations.mainApplication;

import java.util.Scanner;
import com.jdbcCrudOperations.services.StudentServiceCreate;
import com.jdbcCrudOperations.services.StudentServiceDelete;
import com.jdbcCrudOperations.services.StudentServiceRead;
import com.jdbcCrudOperations.services.StudentServiceUpdate;

public class App {

	

	public static void main(String[] args) {
		int i = 1;
		while (i == 1) {
			System.out.println("Enter ");
			System.out.println("1: Add a student");
			System.out.println("2: Delete a student");
			System.out.println("3: List all students");
			System.out.println("4: Update a student's data");
			System.out.println("0: To exit");
			Scanner sc = new Scanner(System.in);
			String input = sc.next().trim();
			if (input.equals("0")) {
				i = 0;
			} else if (input.equals("1")) {
				new StudentServiceCreate().addStudent();
			} else if (input.equals("2")) {
				new StudentServiceDelete().deleteStudent();
			} else if (input.equals("3")) {
				new StudentServiceRead().listAllStudents();
			} else if (input.equals("4")) {
				new StudentServiceUpdate().updateAllDetailsOfStudentById();
			} else {
				System.out.println("Please enter a valid input");
				System.out.println("------------------------------------------");
			}
			
		}
	}
}
