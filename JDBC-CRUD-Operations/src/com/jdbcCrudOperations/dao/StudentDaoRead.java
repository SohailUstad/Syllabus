package com.jdbcCrudOperations.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jdbcCrudOperations.entities.Student;
import com.jdbcCrudOperations.helper.ConnectionProvider;

public class StudentDaoRead {
	
	public List<Student> listAllStudents(){
		List<Student> students=new ArrayList<Student>();
		
		try {
			Connection con=new ConnectionProvider().getConnection();
			
			String query="select * from studentstable";
			Statement s=con.createStatement();
			
			ResultSet rs=s.executeQuery(query);
			
			while(rs.next()) {
				Student student=new Student();
				student.setId(rs.getInt("id"));
				student.setDateOfBirth(rs.getString("dateOfBirth"));
				student.setFirstName(rs.getString("firstName"));
				student.setMiddleName(rs.getString("middleName"));
				student.setLastName(rs.getString("lastName"));
				student.setRollNumber(rs.getInt("rollNumber"));
				student.setPhoneNumber(rs.getString("phoneNumber"));
				students.add(student);
			}
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return students;
	}
	
	public Student getStudentById(int id) {
		Student student=null;
		
		try {
			Connection con=new ConnectionProvider().getConnection();
			
			String query="select * from studentstable where id="+id;
			Statement s=con.createStatement();
			
			ResultSet rs=s.executeQuery(query);
			
			if(rs.next()) {
				student=new Student();
				student.setId(rs.getInt("id"));
				student.setDateOfBirth(rs.getString("dateOfBirth"));
				student.setFirstName(rs.getString("firstName"));
				student.setMiddleName(rs.getString("middleName"));
				student.setLastName(rs.getString("lastName"));
				student.setRollNumber(rs.getInt("rollNumber"));
				student.setPhoneNumber(rs.getString("phoneNumber"));
			}
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return student;
	}
	
	
	//Get Roll Number
	public int getStudentRollNumberById(int id) {
		int rollNumber=0;
		try {
			Connection con=new ConnectionProvider().getConnection();
			
			String query="select rollNumber from studentstable where id="+id;
			Statement s=con.createStatement();
			
			ResultSet rs=s.executeQuery(query);
			
			if(rs.next()) {
				rollNumber=rs.getInt("rollNumber");
			}
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rollNumber;
	}
	
	//Get First Name
	public String getStudentFirstNameById(int id) {
		String firstName=null;
		try {
			Connection con=new ConnectionProvider().getConnection();
			
			String query="select firstName from studentstable where id="+id;
			Statement s=con.createStatement();
			
			ResultSet rs=s.executeQuery(query);
			
			if(rs.next()) {
				firstName=rs.getString("firstName");
			}
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return firstName;
	}
	
	//Get Middle Name
	public String getStudentMiddleNameById(int id) {
		String middleName=null;
		try {
			Connection con=new ConnectionProvider().getConnection();
			
			String query="select middleName from studentstable where id="+id;
			Statement s=con.createStatement();
			
			ResultSet rs=s.executeQuery(query);
			
			if(rs.next()) {
				middleName=rs.getString("middleName");
			}
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return middleName;
	}
	
	//Get Last Name
	public String getStudentLastNameById(int id) {
		String lastName=null;
		try {
			Connection con=new ConnectionProvider().getConnection();
			
			String query="select lastName from studentstable where id="+id;
			Statement s=con.createStatement();
			
			ResultSet rs=s.executeQuery(query);
			
			if(rs.next()) {
				lastName=rs.getString("lastName");
			}
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lastName;
	}
	
	//Get Date Of Birth
	public String getStudentPhoneNumberById(int id) {
		String phoneNumber=null;
		try {
			Connection con=new ConnectionProvider().getConnection();
			
			String query="select phoneNumber from studentstable where id="+id;
			Statement s=con.createStatement();
			
			ResultSet rs=s.executeQuery(query);
			
			if(rs.next()) {
				phoneNumber=rs.getString("phoneNumber");
			}
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return phoneNumber;
	}
	public String getStudentDateOfBirthById(int id) {
		String dateOfBirth=null;
		try {
			Connection con=new ConnectionProvider().getConnection();
			
			String query="select dateOfBirth from studentstable where id="+id;
			Statement s=con.createStatement();
			
			ResultSet rs=s.executeQuery(query);
			
			if(rs.next()) {
				dateOfBirth=rs.getString("dateOfBirth");
			}
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dateOfBirth;
	}
	
//	public static void main(String[] args) {
//		StudentDaoRead s=new StudentDaoRead();
//		int studentRollNumberById = s.getStudentRollNumberById(3);
//		System.out.println(studentRollNumberById);
//		
//		System.out.println(s.getStudentDateOfBirthById(3));
//		System.out.println(s.getStudentFirstNameById(3));
//		System.out.println(s.getStudentLastNameById(3));
//		System.out.println(s.getStudentMiddleNameById(3));
//		System.out.println(s.getStudentPhoneNumberById(3));
//	}
	
}
