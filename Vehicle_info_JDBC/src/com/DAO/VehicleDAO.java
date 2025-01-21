package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.Configuration.ConnectionDB;

public class VehicleDAO {
	
	public void insert() throws Exception {
		
		String iquery = "insert into vehicle(vid, vname,milage, vno) VALUES(?,?,?,?)";
		
		Connection con = ConnectionDB.connect();
		PreparedStatement  ps = con.prepareStatement(iquery);
		Scanner sc = new Scanner(System.in);
		System.out.println("vid = ");
		int vid=sc.nextInt();
		ps.setInt(1, vid);
		
		
		System.out.println("vname = ");
		String vname=sc.next();
		ps.setString(2, vname);
		
		
		System.out.println("mileage = ");
		double mileage = sc.nextDouble();
		ps.setDouble(3, mileage);
		
		
		System.out.println("vno = ");
		String vno = sc.next();
		ps.setString(4, vno);
		
		
		ps.executeUpdate();
		
		
		con.close();
		sc.close();
		
	}
	public void update() throws ClassNotFoundException, SQLException {
		
		String query = "update vehicle set vname=?, milage=?, vno=? where vid=?";
		Connection con =ConnectionDB.connect();
		PreparedStatement ps = con.prepareStatement(query);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("update name = ");
		String name = sc.next();
		ps.setString(1,name);
		
		
		System.out.println("update milage = ");
		double m = sc.nextDouble();
		ps.setDouble(2, m);
		
		
		System.out.println("update vno = ");
		String vno=sc.next();
		ps.setString(3, vno);
		
		System.out.println("update on id = ");
		int id = sc.nextInt();
		ps.setInt(4, id);
		
		ps.executeUpdate();
		con.close();
		sc.close();
	}
	
	public void delete() throws ClassNotFoundException, SQLException {
		
		String query= "delete from vehicle where vid=?";
		Connection con =ConnectionDB.connect();
		PreparedStatement ps = con.prepareStatement(query);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter id for delete element");
		int id = sc.nextInt();
		ps.setInt(1, id);
		
		
		ps.executeUpdate();
		con.close();
		sc.close();
		
	}
	
	public void Display() throws ClassNotFoundException, SQLException {
		String query = "select * from vehicle";
		Connection con = ConnectionDB.connect();
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.executeQuery();
		
		con.close();
	}
	
}
