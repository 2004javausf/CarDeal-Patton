package com.revature.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.daoimpl.CarDAOImpl;
import com.revature.logger.LoggerPage;

public class CreateCar {
	static Scanner scan = new Scanner(System.in);
	static Scanner scandub = new Scanner(System.in);
	public static void createCar(String emp_user_name) {
		String empUN = emp_user_name;
		CarDAOImpl cadi = new CarDAOImpl();
		System.out.println("==========================");
		System.out.println("     Add Car to Lot");
		System.out.println("==========================");
		System.out.println("");
		System.out.println("What is the Make of the Car?");
		String a = scan.nextLine();
		System.out.println("What is the Model of the Car?");
		String b = scan.nextLine();
		System.out.println("What is the Colour of the Car?");
		String c = scan.nextLine();
		System.out.println("What is the Cost of the Car?");
		Double d = scandub.nextDouble();
		System.out.println("");
		System.out.println("|" + a + "| |" + b + "| |" + c + "| |$" + d +"|");
		System.out.println("");
		System.out.println("Is this information correct? [Y/N]");
		String e = scan.nextLine();
		if (e.equalsIgnoreCase("y")) {
			try {
				cadi.createCar(a,b,c,d);
				System.out.println("Car Information added to Database");
				LoggerPage.Log4("info", "Car |" + a + "||" + b + "||" + c + "||$" + d + "| has bean created");
				EmployeeMenu.employeeMenu(empUN);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}else if(e.equalsIgnoreCase("n")){
			System.out.println("Returning to top");
			createCar(empUN);
		}else {
			System.out.println("Invalid Entry");
			System.out.println("Returning to top");
			createCar(empUN);
		}
	}
}
