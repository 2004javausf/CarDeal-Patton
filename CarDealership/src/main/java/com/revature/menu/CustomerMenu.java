package com.revature.menu;

import java.util.Scanner;

import com.revature.menu.viewcar.ViewCarCust;
import com.revature.menu.viewcar.ViewOwnedCust;
import com.revature.menu.viewoffer.ViewOfferCust;

public class CustomerMenu {
	static Scanner scan = new Scanner(System.in);
	public static void customerMenu(String cust_user_name) {
		System.out.println("===================================");
		System.out.println("          Customer Menu");
		System.out.println("===================================");
		System.out.println("");
		System.out.println("[1] View cars on lot");
		System.out.println("[2] Make an Offer on a Car");
		System.out.println("[3] View Your Pending Offers");
		System.out.println("[4] View Your Cars");
		System.out.println("[5] Make a Payment");
		System.out.println("[M] Return to Start Menu");
		System.out.println("[E] Exit Application");
		String custUN = cust_user_name;
		String a = scan.nextLine();
		if (a.equalsIgnoreCase("1")) {
			ViewCarCust.viewCarCust(custUN);
		}else if(a.equalsIgnoreCase("2")) {
			MakeOffer.makeOffer(custUN);
		}else if(a.equalsIgnoreCase("3")) {
			ViewOfferCust.viewOfferCust(custUN);
		}else if(a.equalsIgnoreCase("4")) {
			ViewOwnedCust.viewOwnedCust(custUN);
		}else if(a.equalsIgnoreCase("5")) {
			MakePayment.makePayment(custUN);
		}else if(a.equalsIgnoreCase("m")) {
			OpenMenu.openMenu();
		}else if(a.equalsIgnoreCase("e")) {
			System.out.println("Exiting Application");
		}else {
			System.out.println("Invalid Entry");
			customerMenu(custUN);
		}
	}
}
