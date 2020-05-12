package com.revature.menu;

import java.util.Scanner;

import com.revature.menu.viewcar.ViewCarEmp;
import com.revature.menu.viewoffer.ViewOfferEmp;

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
		System.out.println("[4] View All Pending Offers");
		System.out.println("[5] Approve/Deny Offers");
		System.out.println("[E] Exit Application");
		String a = scan.nextLine();
		if (a.equals("1")) {
			CreateCar.createCar();
		}else if (a.equals("2")){
			RemoveCar.removeCar();
		}else if (a.equals("3")) {
			ViewCarEmp.viewCarEmp();
		}else if (a.equalsIgnoreCase("4")) {
			ViewOfferEmp.viewOfferEmp();
		}else if (a.equalsIgnoreCase("5")) {
			AppDenOffer.appDenOffer();
		}else if (a.equalsIgnoreCase("e")) {
			System.out.println("Exiting Application");
		}else {
			System.out.println("Invalid Entry");
			System.out.println("Returing to Top Menu");
			EmployeeMenu.employeeMenu();
		}
	}
}
