package com.revature.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Car;
import com.revature.beans.OfferPro;
import com.revature.calculations.Calculations;
import com.revature.daoimpl.CarDAOImpl;
import com.revature.daoimpl.OfferProDAOImpl;
import com.revature.daoimpl.OwnedCarDAOImpl;


public class AppDenOffer {
	static Scanner scan = new Scanner(System.in);
	static Scanner scanInt = new Scanner(System.in);
	
	public static void appDenOffer() {
		System.out.println("===================================");
		System.out.println("      Approve/Deny Offer Menu");
		System.out.println("===================================");
		System.out.println("");
		System.out.println("What is the Car ID you are deciding on?");
		int a = scanInt.nextInt();
		OfferProDAOImpl opdid = new OfferProDAOImpl();
		CarDAOImpl cdi = new CarDAOImpl();
		OwnedCarDAOImpl ocdi = new OwnedCarDAOImpl();
		try {
			for (OfferPro opd : opdid.offerProListDec(a)) {
				System.out.print("Customer ID: " + opd.getCust_user_name() + " ");
				System.out.print("|| Car ID: " + opd.getCar_id() + " ");
				System.out.print("|| Current Bid: $" +opd.getCust_bid() + " ");
				System.out.print("|| Status: " + opd.getOffer_pending());
				System.out.println();
				System.out.println("=====================================================================================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Which Customer has won the bid?");
		String b = scan.nextLine();
		try {
			for (OfferPro opd1 : opdid.offerProListChose(b, a)) {
				System.out.print("Customer ID: " + opd1.getCust_user_name() + " ");
				System.out.print("|| Car ID: " + opd1.getCar_id() + " ");
				System.out.print("|| Current Bid: $" +opd1.getCust_bid() + " ");
				System.out.print("|| Status: " + opd1.getOffer_pending());
				System.out.println();
				System.out.println("=====================================================================================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("How long will the Payment Plan be?");
		System.out.println("[A] Five Years");
		System.out.println("      or");
		System.out.println("[B] Ten Years");
		String c = scan.nextLine();
		if(c.equalsIgnoreCase("a")) {
			double month = 60;
			try {
				Car cdi1 = cdi.viewOneCar(a).get(0);
				String cm = cdi1.getCar_make();
				String cmo = cdi1.getCar_model();
				String cc = cdi1.getCar_colour();
				double cco = cdi1.getCar_cost();
				OfferPro op1 = opdid.offerProListChose(b, a).get(0);
				double bid = op1.getCust_bid();
				Calculations calc1 = new Calculations();
				double monCost = calc1.calculateMonthlyCost1(month, cco, bid);
				double startBal = calc1.calculateStartingBalance(cco, bid);
				int monRem = calc1.remainingMonths(startBal, monCost);
				ocdi.createOwnedCar(b, a, cm, cmo, cc, monRem, monCost, startBal);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
}


