package com.jdbcCrudOperations.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jdbcCrudOperations.entities.Student;
import com.jdbcCrudOperations.helper.ConnectionProvider;

public class StudentDaoCreate {

	public boolean addStudent(Student s) {
		boolean b = false;

		try {
			Connection con = new ConnectionProvider().getConnection();
			String query = "insert into studentstable(rollNumber,dateOfBirth,firstName,middleName,lastName,phoneNumber)"
					+ " values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, s.getRollNumber());
			ps.setString(2, s.getDateOfBirth());
			ps.setString(3, s.getFirstName());
			ps.setString(4, s.getMiddleName());
			ps.setString(5, s.getLastName());
			ps.setString(6, s.getPhoneNumber());
			ps.executeUpdate();
			con.close();
			b=true;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return b;
	}

}
