package com.revature.menu;

import java.util.Scanner;

public class EmployeeMenu {
	static Scanner scan = new Scanner(System.in);
	public static void employeeMenu() {
		System.out.println("===================================");
		System.out.println("          Employee Menu");
		System.out.println("===================================");
		System.out.println("");
		System.out.println("[1] Add Car to Lot");
		System.out.println("[2] Remove Car from Lot");
		System.out.println("[3] View Cars in Lot");
		String a = scan.nextLine();
		if (a.equals("1")) {
			CreateCar.createCar();
		}else if (a.equals("2")){
			RemoveCar.removeCar();
		}else if (a.equals("3")) {
			ViewCarEmp.viewCarEmp();
		}
	}
}
