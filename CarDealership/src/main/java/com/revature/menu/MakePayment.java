package com.revature.menu;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.revature.beans.OwnedCars;
import com.revature.calculations.Calculations;
import com.revature.daoimpl.OwnedCarDAOImpl;

public class MakePayment {
	static Scanner scan = new Scanner(System.in);
	static Scanner scanInt = new Scanner(System.in);
	static Scanner scanDouble = new Scanner(System.in);
	public static void makePayment(String cust_user_name) {
		Calculations calc = new Calculations();
		String custUN = cust_user_name;
		System.out.println("==========================");
		System.out.println("  Make a Payment Your Car");
		System.out.println("==========================");
		System.out.println("");
		OwnedCarDAOImpl ocdi = new OwnedCarDAOImpl();
		try {
			for (OwnedCars oc : ocdi.ownedCarListCust(custUN)) {
				System.out.print("ID: " + oc.getCar_id() + " ");
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
		System.out.println("What is the ID of the car you wish to make a payment for?");
		try{
			int a = scanInt.nextInt();	
			System.out.println("How do you wish to pay?");
			System.out.println("[1] Monthly Payment");
			System.out.println("[2] Custom Payment");
			System.out.println("[R] Return to Customer Screen");
			System.out.println("[E] Exit Application");
			String b = scan.nextLine();
			if(b.equalsIgnoreCase("1")) {
				System.out.println("How many months do you wish to pay for?");
				try {
					int c = scanInt.nextInt();
					try {
						OwnedCars oc1 = ocdi.ownedCarListCust1(a).get(0);
						double d = oc1.getMonthly_payments();
						double payment = calc.months(c, d);
						System.out.println("Payment will be: " + payment);
						System.out.println("Is this correct? [Y/N]");
						String e = scan.nextLine();
						if(e.equalsIgnoreCase("y")) {
							double curBal = oc1.getPayment_remaining();
							double newBal = calc.paymentMade(curBal, payment);
							int monRem = calc.remainingMonths1(newBal, d);
							ocdi.paymentMade(custUN, a, monRem, newBal);
							System.out.println("Your updated car payments:");
							try {
								for (OwnedCars oc : ocdi.ownedCarListCust(custUN)) {
									System.out.print("ID: " + oc.getCar_id() + " ");
									System.out.print("|| Monthly Payments: " + oc.getMonthly_payments() + " ");
									System.out.print("|| Months Remaing: " + oc.getMonth_payments_remaining() + " ");
									System.out.print("|| Remaining Balance: " + oc.getPayment_remaining());
									System.out.println();
									System.out.println("============================================================================");
									System.out.println("Returning to Customer Menu");
									CustomerMenu.customerMenu(cust_user_name);
								}
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}catch (InputMismatchException m) {
					System.out.println("Invalid Entry");
					System.out.println("Returning to top");
					MakePayment.makePayment(custUN);
				}
			}else if (b.equalsIgnoreCase("2")) {
				System.out.println("How much do you wish to pay?");
				try {
					double payment = scanDouble.nextDouble();
					try {
						OwnedCars oc1 = ocdi.ownedCarListCust1(a).get(0);
						double d = oc1.getMonthly_payments();
						System.out.println("Payment will be: " + payment);
						System.out.println("Is this correct? [Y/N]");
						String e = scan.nextLine();
						if(e.equalsIgnoreCase("y")) {
							double curBal = oc1.getPayment_remaining();
							double newBal = calc.paymentMade(curBal, payment);
							int monRem = calc.remainingMonths1(newBal, d);
							ocdi.paymentMade(custUN, a, monRem, newBal);
							System.out.println("Your updated car payments:");
							try {
								for (OwnedCars oc : ocdi.ownedCarListCust(custUN)) {
									System.out.print("ID: " + oc.getCar_id() + " ");
									System.out.print("|| Monthly Payments: " + oc.getMonthly_payments() + " ");
									System.out.print("|| Months Remaing: " + oc.getMonth_payments_remaining() + " ");
									System.out.print("|| Remaining Balance: " + oc.getPayment_remaining());
									System.out.println();
									System.out.println("============================================================================");
									System.out.println("Returning to Customer Menu");
									CustomerMenu.customerMenu(cust_user_name);
								}
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}catch (InputMismatchException m) {
					System.out.println("Invalid Entry");
					System.out.println("Returning to top");
					MakePayment.makePayment(custUN);
				}
			}else if (b.equalsIgnoreCase("r")) {
				System.out.println("Returning to Customer Menu");
				CustomerMenu.customerMenu(cust_user_name);
			}else if (b.equalsIgnoreCase("e")) {
				System.out.println("Exiting Application");
			}else {
				System.out.println("Invalid Entry");
				System.out.println("Returning to top");
				MakePayment.makePayment(custUN);
			}
		}catch (InputMismatchException m) {
			System.out.println("Invalid Entry");
			System.out.println("Returning to top");
			MakePayment.makePayment(custUN);
		}
	}
}
