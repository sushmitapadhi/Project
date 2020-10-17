package com.sp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class DBConnector {
	
	DBConnector db;
	static Connection connection;
	
	private DBConnector() throws ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
	
		if (connection==null)
		Class.forName("com.mysql.jdbc.Driver");
		
		connection=DriverManager.getConnection("Jdbc:mysql://localhost:3306/schemaone","root","SPDXCTech@186");
	}
		public static Connection getConnection() throws ClassNotFoundException, SQLException
		{
			return connection;
	
	
	

		
		

    }
}
