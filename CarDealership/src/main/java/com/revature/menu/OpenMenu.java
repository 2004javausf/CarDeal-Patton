package com.revature.menu;

import java.util.Scanner;

import com.revature.menu.loginmenu.CustomerLoginMenu;
import com.revature.menu.loginmenu.EmployeeLoginMenu;

public class OpenMenu {
	static Scanner scan = new Scanner(System.in);
	public static void openMenu() {
		System.out.println("==========================");
		System.out.println("   Welcome to ZP Cars");
		System.out.println("");
		System.out.println("  Are you an Employee? [E]");
		System.out.println("           or");
		System.out.println("   Are you a Customer? [C]");
		String a = scan.nextLine();
		if (a.equalsIgnoreCase("e")) {
			EmployeeLoginMenu.employeeLoginMenu();
		}else if (a.equalsIgnoreCase("c")) {
			CustomerLoginMenu.customerLoginMenu();
		}else {
			System.out.println("Invalid Entry");
			openMenu();
		}
	}
	
}
