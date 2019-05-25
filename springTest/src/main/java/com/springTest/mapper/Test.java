package com.springTest.mapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
 
 public void insert_code(String cd, String name) throws SQLException {
	 
	 try {
		Class.forName("org.sqlite.JDBC");
		String url = "jdbc:sqlite:/C:/Users/K/MySQLiteDB";
		Connection db = DriverManager.getConnection(url);
		String sql = "insert into sj_cm_code values (?,?);";
	    PreparedStatement stmt = db.prepareStatement(sql);
	   
	    stmt.setString(1, cd);
	    stmt.setString(2, name);
	    
	    stmt.execute();
	    
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 public String open(String id) {
	 String num_one="";
	 try {
		   Class.forName("org.sqlite.JDBC");
		   String url = "jdbc:sqlite:/C:/Users/K/MySQLiteDB";
		   Connection db = DriverManager.getConnection(url);
		   if(id.equals("asd")) {
			   String query = "select * from SJ_CM_CODE;"; 
			   PreparedStatement pre = db.prepareStatement(query);
			   ResultSet row = pre.executeQuery();
			   
			   if(row.next()) { 
				   num_one=row.getString(1); 
				   System.out.println("처음 : "+num_one);
			   }
			   row.close(); 
			   pre.close();
			   db.close();
			   
		   }
		   
		  } catch(ClassNotFoundException e) {
		   System.err.println("Error : " + e);
		  } catch(SQLException e) {
		   System.err.println("Error : " + e);
		  }
	 return num_one;
 }
}
