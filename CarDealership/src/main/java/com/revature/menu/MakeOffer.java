package com.revature.menu;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.revature.beans.Car;
import com.revature.daoimpl.CarDAOImpl;
import com.revature.daoimpl.OfferProDAOImpl;
import com.revature.logger.LoggerPage;
import com.revature.menu.viewcar.ViewCarCust;

public class MakeOffer  {
	static Scanner scan = new Scanner(System.in);
	static Scanner scanInt = new Scanner(System.in);
	static Scanner scanDouble = new Scanner(System.in);
	public static void makeOffer(String cust_user_name) {
		OfferProDAOImpl opdi = new OfferProDAOImpl();
		String custUN = cust_user_name;
		System.out.println("===================================");
		System.out.println("        Customer Offer Menu");
		System.out.println("===================================");
		System.out.println("");
		System.out.println("What is the ID of the car you would like to bid on?");
		int a = scanInt.nextInt();
		CarDAOImpl cadi1 = new CarDAOImpl();
		try {
			for (Car obj1 : cadi1.viewOneCar(a)) {
				System.out.print("ID: " + obj1.getCar_id() + " ");
				System.out.print("|| Make: " + obj1.getCar_make() + " ");
				System.out.print("|| Model: " + obj1.getCar_model() + " ");
				System.out.print("|| Colour: " + obj1.getCar_colour() + " ");
				System.out.print("|| Cost: " + obj1.getCar_cost());
				System.out.println();
				System.out.println("============================================================================");
				System.out.println("Is this the correct car? [Y/N]");
			}
		} catch (SQLException e) {
			System.out.println("That ID is invalid, redirecting to car view");
			ViewCarCust.viewCarCust(custUN);
			e.printStackTrace();
		}
		String b = scan.nextLine();
		if (b.equalsIgnoreCase("y")) {
			System.out.println("How much is your bid?");
			try {
				double c = scanDouble.nextDouble();
				System.out.println("Is this bid correct? [Y/N]");
				System.out.println("Bid: " + c);
				String d = scan.next();
				if (d.equalsIgnoreCase("y")) {
					try {
						opdi.createOfferPro(cust_user_name, a, c, "Pending");
						System.out.println("Your bid has been added.");
						System.out.println("Please come back later to see if has won");
						System.out.println("====================================================");
						System.out.println("Returning to Customer Menu");
						LoggerPage.Log4("info", "Customer " + custUN + " has made a bid of " + c + " on the car with ID: " + a);
						CustomerMenu.customerMenu(custUN);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if (d.equalsIgnoreCase("n")) {
					System.out.println("Returning to Customer Menu");
					CustomerMenu.customerMenu(custUN);
				}else {
					System.out.println("Invalid Entry");
					System.out.println("Returning to the top");
					MakeOffer.makeOffer(custUN);
					}
			}catch (InputMismatchException i) {
				System.out.println("Invalid: Not a dollar amount");
				System.out.println("Returning to the top");
				MakeOffer.makeOffer(custUN);
			}
		}else if (b.equalsIgnoreCase("n")) {
			System.out.println("Returning to Customer Menu");
			CustomerMenu.customerMenu(custUN);
		}else {
			System.out.println("Invalid Entry");
			System.out.println("Returning to the top");
			MakeOffer.makeOffer(custUN);
		}
		
	}
	
}
