package com.revature.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Car;
import com.revature.daoimpl.CarDAOImpl;

public class ViewCarCust {
	static Scanner scan = new Scanner(System.in);
	public static void viewCarCust() {
		System.out.println("==========================");
		System.out.println("         View Cars");
		System.out.println("==========================");
		System.out.println("");
		CarDAOImpl cadi = new CarDAOImpl();
		try {
			for (Car obj : cadi.getCarList()) {
				System.out.print("ID: " + obj.getCar_id() + " ");
				System.out.print("|| Make: " + obj.getCar_make() + " ");
				System.out.print("|| Model: " + obj.getCar_model() + " ");
				System.out.print("|| Colour: " + obj.getCar_colour() + " ");
				System.out.print("|| Cost: " + obj.getCar_cost());
				System.out.println();
				System.out.println("============================================================================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Return to Customer Menu? [Y/N]");
		String a = scan.nextLine();
		if (a.equalsIgnoreCase("y")) {
			CustomerMenu.customerMenu();
		}else if (a.equalsIgnoreCase("n")) {
			System.out.println("Exiting Application");
		}else {
			System.out.println("Invalid Entry");
			System.out.println("Returning to Customer Menu");
			CustomerMenu.customerMenu();
		}
			
	}
}
