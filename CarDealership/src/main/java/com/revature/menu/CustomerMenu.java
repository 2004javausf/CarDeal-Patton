package com.revature.menu;

import java.util.Scanner;

public class CustomerMenu {
	static Scanner scan = new Scanner(System.in);
	public static void customerMenu() {
		System.out.println("===================================");
		System.out.println("          Customer Menu");
		System.out.println("===================================");
		System.out.println("");
		System.out.println("[1] View cars on lot");
		System.out.println("[E] Exit Application");
		String a = scan.nextLine();
		if (a.equalsIgnoreCase("1")) {
			ViewCarCust.viewCarCust();
		}else if(a.equalsIgnoreCase("e")) {
			System.out.println("Exiting Application");
		}else {
			System.out.println("Invalid Entry");
			customerMenu();
		}
	}
}
