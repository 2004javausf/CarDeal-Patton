package com.revature.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Car;
import com.revature.daoimpl.CarDAOImpl;

public class RemoveCar {
	static Scanner scan = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);
	public static void removeCar() {
		CarDAOImpl cadi4 = new CarDAOImpl();
		System.out.println("==========================");
		System.out.println("   Remove Car from Lot");
		System.out.println("==========================");
		System.out.println("");
		System.out.println("What is the Car ID you wish to remove?");
		int a = scan.nextInt();
		Car b = RemoveCar.carList(a);
		System.out.println(b);
		System.out.println("");
		System.out.println("Is this the car you wish to remove?");
		System.out.println("      All removals are final");
		System.out.println("              [Y/N]");
		String c = sc.nextLine();
		if(c.equalsIgnoreCase("y")) {
			try {
				cadi4.removeCar(a);
				System.out.println("Car Removed from Lot");
				System.out.println("Returning to Employee Menu");
				EmployeeMenu.employeeMenu();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if (c.equalsIgnoreCase("n")) {
			System.out.println("Returning to Employee Menu");
			EmployeeMenu.employeeMenu();
		}else {
			System.out.println("Invalid Entry");
			removeCar();
		}
		
	}
	
	public static Car carList (int input_car_id) {
		CarDAOImpl cadi3 = new CarDAOImpl();
		try {
			for (int i = 0; i < cadi3.getCarList().size() ; i++) {
				int car_id = cadi3.getCarList().get(i).getCar_id();
				if(input_car_id == car_id) {
					return cadi3.getCarList().get(i);
				}else {
					System.out.println("Invalid Entry");
					RemoveCar.removeCar();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
