package com.springTest.mapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import beans.SjCmCode;

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
	    
	    stmt.close();
	    db.close();
	    
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 public ArrayList<SjCmCode> open(String id) {
	 ArrayList<SjCmCode> items = new ArrayList<SjCmCode>();

	 SjCmCode testItem = new SjCmCode();
	 String num_one="";
	 String nm="";
	 
	 try {
		   Class.forName("org.sqlite.JDBC");
		   String url = "jdbc:sqlite:/C:/Users/K/MySQLiteDB";
		   Connection db = DriverManager.getConnection(url);
		   if(id.equals("asd")) {
			   String query = "select * from SJ_CM_CODE;"; 
			   PreparedStatement pre = db.prepareStatement(query);
			   ResultSet row = pre.executeQuery();
			   
			   while(row.next()) {
				   num_one=row.getString(1);
				   nm=row.getString(2);
				   System.out.println("처음 : "+num_one);
				   System.out.println("이름 : "+nm);
				   
				   testItem.setCmCode(num_one);
				   testItem.setCmCodeName(nm);
				   
				   items.add(testItem);
				   
				   testItem = null;
				   testItem = new SjCmCode();
				 
			   }
			   System.out.println(items.toString());
			   
			   row.close(); 
			   pre.close();
			   db.close();
			   
		   }
		   
		  } catch(ClassNotFoundException e) {
		   System.err.println("Error : " + e);
		  } catch(SQLException e) {
		   System.err.println("Error : " + e);
		  }
	 return items;
 }
}
