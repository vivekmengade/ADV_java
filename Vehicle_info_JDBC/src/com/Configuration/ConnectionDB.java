package com.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
	public static Connection connect() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/VehicleJDBC","root","Vivek@123");
		
		return con;
	}
}
