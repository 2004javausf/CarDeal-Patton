package com.revature.menus.customer;

import java.util.Scanner;

import com.revature.beans.CustomerBean;
import com.revature.files.UserLists;

public class CustomerLoginMenu {

	public static void customerLoginMenu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===========================");
		System.out.println("    Customer Login Menu    ");
		System.out.println("===========================");
		System.out.println(" ");
		System.out.println("Are you a new customer? [y/n]");
		String a = sc.nextLine();
		if (a.equalsIgnoreCase("y")) {
			System.out.println("create new customer menu");
		}else if (a.equalsIgnoreCase("n"));
			System.out.println("Please Enter your Username");
			String b = sc.nextLine();
			System.out.println("Please Enter your Password");
			String c = sc.nextLine();
			CustomerBean d = UserLists.LoginCustomer(b, c);
			
			
	}
}