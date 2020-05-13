package com.revature.menu.loginmenu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Customer;
import com.revature.daoimpl.CustomerDAOImpl;
import com.revature.logger.LoggerPage;
import com.revature.menu.CustomerMenu;
import com.revature.menu.OpenMenu;


public class CustomerLoginMenu {
	static Scanner scan = new Scanner(System.in);
	public static void customerLoginMenu() {
		System.out.println("===================================");
		System.out.println("Are you an Existing Customer? [Y/N]");
		System.out.println("===================================");
		System.out.println("");
		String a = scan.nextLine();
		if (a.equalsIgnoreCase("y")) {
			customerLogin();
		}else if (a.equalsIgnoreCase("n")) {
			createNewCustomer();		
		}else {
			System.out.println("Invalid Entry");
			customerLoginMenu();
		}
		
	}
	
	public static void customerLogin() {
		CustomerDAOImpl cdi1 = new CustomerDAOImpl();
		try {
			cdi1.getCustomerList();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("===================================");
		System.out.println("         Customer Login");
		System.out.println("===================================");
		System.out.println("");
		System.out.println("Please Enter Your Username");
		String g = scan.nextLine();
		System.out.println("Please Enter Your Password");
		String h = scan.nextLine();
		Customer j = cl(g,h);
		if (j.getCust_user_name().equals(g)) {
			LoggerPage.Log4("info", "Customer " + g + " has logged in");
			CustomerMenu.customerMenu(g);
		}else {
			System.out.println("Invalid Login");
			OpenMenu.openMenu();
		}
	
	}
		
	public static void createNewCustomer() {
		System.out.println("===================================");
		System.out.println("      New Customer Sign-up");
		System.out.println("===================================");
		System.out.println("");
		System.out.println("Please Enter Your First Name");
		String d = scan.nextLine();
		System.out.println("Please Enter Your Last Name");
		String e = scan.nextLine();
		System.out.println("Please Enter a Username");
		String b = scan.nextLine();
		System.out.println("Please Enter a Password");
		String c = scan.nextLine();
		System.out.println(d + " " + e + ", you have entered " + b + " as your username and " + c + " as your password.");
		System.out.println("Please confirm this information is correct and you wish to continue [Y/N]");
		String f = scan.nextLine();
		if (f.equalsIgnoreCase("y")) {
			CustomerDAOImpl cdi = new CustomerDAOImpl();
			try {
				cdi.createCustomer(d, e, b, c);
			} catch (SQLException e1) {
				System.out.println("Username already in use");
				System.out.println("Returning to customer login screen");
				customerLoginMenu();
				e1.printStackTrace();
			}
			System.out.println("Customer Login information created");
			System.out.println("Returning to customer login screen");
			LoggerPage.Log4("info", "Customer " + d + " " + e + " with username: " + b + "has been created");
			customerLoginMenu();
		}else if(f.equalsIgnoreCase("n")) {
			System.out.println("Restarting create customer");
			createNewCustomer();
		}else {
			System.out.println("Invalid entry");
			System.out.println("Restarting create customer");
			createNewCustomer();
		}
	}

	public static Customer cl(String input_cust_user_name, String input_cust_pass_word) {
	CustomerDAOImpl cdi2 = new CustomerDAOImpl();
	try {
		for (int i = 0; i < cdi2.getCustomerList().size(); i++) {
			String cust_user_name = cdi2.getCustomerList().get(i).getCust_user_name();
			String cust_pass_word = cdi2.getCustomerList().get(i).getCust_pass_word();
			if(input_cust_user_name.equals(cust_user_name) && input_cust_pass_word.equals(cust_pass_word)) {
				return cdi2.getCustomerList().get(i);
			}
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
}
