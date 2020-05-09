package com.revature.menus;

import java.util.Scanner;

import com.revature.menus.customer.CustomerLoginMenu;
import com.revature.menus.employee.EmployeeLoginMenu;

public class MainMenu {
	
	public static void mainMenu() {
		Scanner scmm = new Scanner(System.in);
		System.out.println("===========================");
		System.out.println("     Welcome to ZP Cars    ");
		System.out.println("===========================");
		System.out.println(" ");
		System.out.println("   Are you a [C]ustomer");
		System.out.println("           or");
		System.out.println("  Are you an [E]mployee");
		String a = scmm.nextLine();
		if (a.equalsIgnoreCase("c")) {
			CustomerLoginMenu.customerLoginMenu();
		}else if (a.equalsIgnoreCase("e")) {
			EmployeeLoginMenu.employeeLoginMenu();
		}else {
			System.out.println("Invalid Entry");
			mainMenu();
		}
	}
}
