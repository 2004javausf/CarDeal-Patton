package com.revature.menu.viewcar;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.OwnedCars;
import com.revature.daoimpl.OwnedCarDAOImpl;
import com.revature.menu.CustomerMenu;
import com.revature.menu.EmployeeMenu;
import com.revature.menu.MakePayment;

public class ViewOwnedEmp {
	static Scanner scan = new Scanner(System.in);
	public static void viewOwnedEmp() {
		System.out.println("==========================");
		System.out.println("    View All Owned Cars");
		System.out.println("==========================");
		System.out.println("");
		OwnedCarDAOImpl ocdi = new OwnedCarDAOImpl();
		try {
			for (OwnedCars oc : ocdi.ownedCarsList()) {
				System.out.print("ID: " + oc.getCar_id() + " ");
				System.out.print("|| Make: " + oc.getCar_make() + " ");
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
		System.out.println("[1] Return to Employee Menu ");
		System.out.println("[E] Exit Application ");
		String a = scan.nextLine();
		if(a.equalsIgnoreCase("1")) {
			EmployeeMenu.employeeMenu();
		}else if (a.equalsIgnoreCase("e")) {
			System.out.println("Exiting Application");
		}else {
			System.out.println("Invalid Entry");
			System.out.println("Returning to Employee Menu");
			EmployeeMenu.employeeMenu();
		}
			
	}
}

