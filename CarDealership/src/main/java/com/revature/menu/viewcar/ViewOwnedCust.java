package com.revature.menu.viewcar;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.OwnedCars;
import com.revature.daoimpl.OwnedCarDAOImpl;
import com.revature.logger.LoggerPage;
import com.revature.menu.CustomerMenu;
import com.revature.menu.MakeOffer;
import com.revature.menu.MakePayment;

public class ViewOwnedCust {
	static Scanner scan = new Scanner(System.in);
	public static void viewOwnedCust(String cust_user_name) {
		String custUN = cust_user_name;
		System.out.println("==========================");
		System.out.println("       View Your Cars");
		System.out.println("==========================");
		System.out.println("");
		OwnedCarDAOImpl ocdi = new OwnedCarDAOImpl();
		try {
			for (OwnedCars oc : ocdi.ownedCarListCust(custUN)) {
				System.out.print("ID: " + oc.getCar_id() + " ");
				System.out.print("|| Make: " + oc.getCar_make() + " ");
				System.out.print("|| Model: " + oc.getCar_model() + " ");
				System.out.print("|| Colour: " + oc.getCar_colour() + " ");
				System.out.print("|| Monthly Payments: " + oc.getMonthly_payments() + " ");
				System.out.print("|| Months Remaing: " + oc.getMonth_payments_remaining() + " ");
				System.out.print("|| Remaining Balance: " + oc.getPayment_remaining());
				System.out.println();
				System.out.println("============================================================================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoggerPage.Log4("info", "Customer " + custUN + " has viewed the cars they own");
		System.out.println("[1] Make a Payment");
		System.out.println("[2] Return to Customer Menu");
		System.out.println("[E] Exit Application ");
		String a = scan.nextLine();
		if(a.equalsIgnoreCase("1")) {
			MakePayment.makePayment(custUN);
		}else if (a.equalsIgnoreCase("2")) {
			CustomerMenu.customerMenu(custUN);
		}else if (a.equalsIgnoreCase("e")) {
			LoggerPage.Log4("info", "Application closed, all users logged out");
			System.out.println("Exiting Application");
		}else {
			System.out.println("Invalid Entry");
			System.out.println("Returning to Customer Menu");
			CustomerMenu.customerMenu(custUN);
		}
			
	}
}