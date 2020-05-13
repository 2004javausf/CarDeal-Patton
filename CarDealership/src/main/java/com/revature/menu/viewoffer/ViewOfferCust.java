package com.revature.menu.viewoffer;


import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.OfferPro;
import com.revature.daoimpl.OfferProDAOImpl;
import com.revature.logger.LoggerPage;
import com.revature.menu.CustomerMenu;

public class ViewOfferCust {
	static Scanner scan = new Scanner(System.in);
	public static void viewOfferCust(String cust_user_name) {
		String custUN = cust_user_name;
		OfferProDAOImpl opdic = new OfferProDAOImpl();
		try {
			for (OfferPro opc : opdic.offerProListCust(custUN)) {
				System.out.print("Your ID: " + opc.getCust_user_name() + " ");
				System.out.print("|| Car ID: " + opc.getCar_id() + " ");
				System.out.print("|| Current Bid: $" +opc.getCust_bid() + " ");
				System.out.print("|| Status: " + opc.getOffer_pending());
				System.out.println();
				System.out.println("=====================================================================================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoggerPage.Log4("info", "Customer " + custUN + " has viewed the cars they have pending offers on");
		System.out.println("[1] Return to Customer Menu");
		System.out.println("[E] Exit Application");
		String a = scan.nextLine();
		if (a.equalsIgnoreCase("1")) {
			CustomerMenu.customerMenu(custUN);
		}else if (a.equalsIgnoreCase("e")) {
			System.out.println("Exiting Application");
		}else {
			System.out.println("Invalid Entry");
			System.out.println("Returning to Customer Menu");
			CustomerMenu.customerMenu(custUN);
		}
	}
}
