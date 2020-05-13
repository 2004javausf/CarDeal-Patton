package com.revature.calculations;

import com.revature.beans.Car;
import com.revature.beans.OfferPro;
import com.revature.beans.OwnedCars;

public class Calculations {
//	public static void calculateMonthlyCost(int months, Car c, OfferPro op, double d) {
//		int mon = months;
//		double cost = c.getCar_cost();
//		double offer = op.getCust_bid();
//		d = ((Math.round(((cost-offer)/mon)*100.0))/100.0);
//		
//	}
//	
	public double calculateMonthlyCost1(double months, double cost, double offer) {
		double d = ((Math.round(((cost-offer)/months)*100.0))/100.0);
		return d;
	}
	
	public double calculateStartingBalance(double cost, double offer) {
		double c = (Math.round((cost-offer)*100.00)/100.00);
		return c;
	}
	
	public int remainingMonths (double bal, double monCost) {
		int b = (int) (Math.round(bal/monCost));
		return b;
	}
	
	public double paymentMade (double bal1, double payment) {
		double e = (Math.round((bal1-payment)*100.00)/100.00);
		return e;
	}
	
	public int remainingMonths1 (double bal2, double monCost1) {
		int f = (int) (Math.round((bal2/monCost1)*100.00)/100.00);
		return f;
	}
	
	public double months (int months, double monthCost) {
		double g = (Math.round((months*monthCost)*100.00)/100.00);
		return g;
	}
}
