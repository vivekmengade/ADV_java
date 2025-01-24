package com.Client;

import java.util.Scanner;

import com.DAO.VehicleDAO;

public class App {

	public static void main(String[] args) throws Exception {
		VehicleDAO v = new VehicleDAO();
		
		Scanner sc = new Scanner(System.in);
//		v.insert();
//		v.update();
//		v.delete();
//		v.Display();
		
		boolean flag = true;
		
		while(flag) {
			
		
		System.out.println("Enter choice");
		System.out.println("1.insert data ");
		System.out.println("2.update data");
		System.out.println("3.delete data");
		System.out.println("4.display data");
		System.out.println("5. data by vid");
		System.out.println("6. Exit");
		
		int ch =sc.nextInt();
		switch(ch) {
		
		case 1: v.insert();
		break;
		
		case 2: v.update();
		break;
		
		case 3: v.delete();
		break;
		
		case 4: v.Display();
		break;
		
		case 5: v.ShowSingleData();
		break;
		
		case 6: 
			flag=false;
			System.out.println("Thank you!!");
			break;
			
		default:
			System.out.println("Invalid Input");
		}
		}
		sc.close();
		
//		v.ShowSingleData();
		
	}
	
}
