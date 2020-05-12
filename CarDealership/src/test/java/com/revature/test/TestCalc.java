package com.revature.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.revature.beans.Car;
import com.revature.beans.OfferPro;
import com.revature.beans.OwnedCars;
import com.revature.calculations.Calculations;

class TestCalc {

//	Car car = new Car(1, "make", "model", "colour", 10000);
//	OfferPro op = new OfferPro("user", 1, 2000, "pend");
//	double d = 0;
//	@Test
//	void calcMonthlyCostTest() {
//		Calculations.calculateMonthlyCost(60, car, op, d);
//		assertEquals(133.33, d);
//	}
//	
	Calculations calcmon = new Calculations();
	@Test
	void calcMonCostTest1() {
		double a = calcmon.calculateMonthlyCost1(60, 10000, 2000);
		assertEquals(133.33, a); 
	}
	
	@Test
	void calcStartBalTest() {
		double b = calcmon.calculateStartingBalance(10000, 2000);
		assertEquals(8000, b);
	}
	
	@Test
	void calcMonRemTest() {
		double c = calcmon.remainingMonths(8000, 133.33);
		assertEquals (60, c);
	}
}
