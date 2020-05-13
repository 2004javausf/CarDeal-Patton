package com.revature.menu;

import java.util.Scanner;

import com.revature.logger.LoggerPage;
import com.revature.menu.loginmenu.CreateEmpLogin;
import com.revature.menu.viewcar.ViewCarEmp;
import com.revature.menu.viewcar.ViewOwnedEmp;
import com.revature.menu.viewoffer.ViewOfferEmp;

public class EmployeeMenu {
	static Scanner scan = new Scanner(System.in);
	public static void employeeMenu(String emp_user_name) {
		String empUN = emp_user_name;
		System.out.println("===================================");
		System.out.println("          Employee Menu");
		System.out.println("===================================");
		System.out.println("");
		System.out.println("[1] Add Car to Lot");
		System.out.println("[2] Remove Car from Lot");
		System.out.println("[3] View Cars in Lot");
		System.out.println("[4] View All Pending Offers");
		System.out.println("[5] Approve/Deny Offers");
		System.out.println("[6] View All Owned Cars");
		System.out.println("[7] Create new Employee Login");
		System.out.println("[M] Return to Start Menu");
		System.out.println("[E] Exit Application");
		String a = scan.nextLine();
		if (a.equals("1")) {
			CreateCar.createCar(empUN);
		}else if (a.equals("2")){
			RemoveCar.removeCar(empUN);
		}else if (a.equals("3")) {
			ViewCarEmp.viewCarEmp(empUN);
		}else if (a.equalsIgnoreCase("4")) {
			ViewOfferEmp.viewOfferEmp(empUN);
		}else if (a.equalsIgnoreCase("5")) {
			AppDenOffer.appDenOffer(empUN);
		}else if (a.equalsIgnoreCase("6")) {
			ViewOwnedEmp.viewOwnedEmp(empUN);
		}else if (a.equalsIgnoreCase("7")) {
			CreateEmpLogin.createEmpLogin(empUN);
		}else if (a.equalsIgnoreCase("m")) {
			LoggerPage.Log4("info", "Employee " + empUN + " has logged out");
			OpenMenu.openMenu();
		}else if (a.equalsIgnoreCase("e")) {
			LoggerPage.Log4("info", "Application closed, all users logged out");
			System.out.println("Exiting Application");
		}else {
			System.out.println("Invalid Entry");
			System.out.println("Returing to Top Menu");
			EmployeeMenu.employeeMenu(empUN);
		}
	}
}
