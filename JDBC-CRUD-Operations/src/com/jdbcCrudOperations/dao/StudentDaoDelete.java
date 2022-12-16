package com.jdbcCrudOperations.dao;

import java.sql.Connection;
import java.sql.Statement;

import com.jdbcCrudOperations.helper.ConnectionProvider;

public class StudentDaoDelete {

	public boolean deleteStudent(int id) {
		boolean b=false;
		
		try {
			Connection con=new ConnectionProvider().getConnection();
			String query="delete from studentstable where id="+id;
			Statement st=con.createStatement();
			st.executeUpdate(query);
			con.close();
			b=true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return b;
	}

}
