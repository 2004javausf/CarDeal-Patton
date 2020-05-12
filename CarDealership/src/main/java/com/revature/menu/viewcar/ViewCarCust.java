package com.revature.menu.viewcar;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Car;
import com.revature.daoimpl.CarDAOImpl;
import com.revature.menu.CustomerMenu;
import com.revature.menu.MakeOffer;

public class ViewCarCust {
	static Scanner scan = new Scanner(System.in);
	public static void viewCarCust(String cust_user_name) {
		String custUN = cust_user_name;
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
		System.out.println("[1] Make an Offer on a Car");
		System.out.println("[2] Return to Customer Menu ");
		System.out.println("[E] Exit Application ");
		String a = scan.nextLine();
		if(a.equalsIgnoreCase("1")) {
			MakeOffer.makeOffer(custUN);
		}else if (a.equalsIgnoreCase("y")) {
			CustomerMenu.customerMenu(custUN);
		}else if (a.equalsIgnoreCase("n")) {
			System.out.println("Exiting Application");
		}else {
			System.out.println("Invalid Entry");
			System.out.println("Returning to Customer Menu");
			CustomerMenu.customerMenu(custUN);
		}
			
	}
}
