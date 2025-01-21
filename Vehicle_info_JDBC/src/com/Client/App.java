package com.Client;

import com.DAO.VehicleDAO;

public class App {

	public static void main(String[] args) throws Exception {
		VehicleDAO v = new VehicleDAO();
//		v.insert();
//		v.update();
//		v.delete();
		v.Display();
	}
	
}
