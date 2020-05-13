package com.revature.menu.viewoffer;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.OfferPro;
import com.revature.daoimpl.OfferProDAOImpl;
import com.revature.logger.LoggerPage;
import com.revature.menu.AppDenOffer;
import com.revature.menu.EmployeeMenu;

public class ViewOfferEmp {
	static Scanner scan = new Scanner(System.in);
	public static void viewOfferEmp(String emp_user_name) {
		String empUN = emp_user_name;
		System.out.println("===================================");
		System.out.println("     Employee View Offers Menu");
		System.out.println("===================================");
		System.out.println("");
		OfferProDAOImpl opdie = new OfferProDAOImpl();
		try {
			for (OfferPro op : opdie.offerProListAll()) {
				System.out.print("Customer ID: " + op.getCust_user_name() + " ");
				System.out.print("|| Car ID: " + op.getCar_id() + " ");
				System.out.print("|| Current Bid: $" +op.getCust_bid() + " ");
				System.out.print("|| Status: " + op.getOffer_pending());
				System.out.println();
				System.out.println("=====================================================================================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoggerPage.Log4("info", "Employee " + empUN + " has viewed all offers");
		System.out.println("[1] Accept Offer");
		System.out.println("[2] Return to Employee Menu");
		System.out.println("[E] Exit Application");
		String a = scan.nextLine();
		if (a.equalsIgnoreCase("1")) {
			AppDenOffer.appDenOffer(empUN);
		}else if (a.equalsIgnoreCase("2")) {
			EmployeeMenu.employeeMenu(empUN);
		}else if (a.equalsIgnoreCase("e")){
			LoggerPage.Log4("info", "Application closed, all users logged out");
			System.out.println("Exiting Application");
		}else {
			System.out.println("Invalid Entry");
			System.out.println("Returning to Employee Menu");
			EmployeeMenu.employeeMenu(empUN);
		}
	}
}
