package com.revature.menu.viewcar;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Car;
import com.revature.daoimpl.CarDAOImpl;
import com.revature.logger.LoggerPage;
import com.revature.menu.EmployeeMenu;

public class ViewCarEmp {
	static Scanner scan = new Scanner(System.in);
	public static void viewCarEmp(String emp_user_name) {
		String empUN = emp_user_name;
		System.out.println("==========================");
		System.out.println("         View Cars");
		System.out.println("==========================");
		System.out.println("");
		CarDAOImpl cadi = new CarDAOImpl();
		try {
			for (Car obj : cadi.getCarList()) {
				System.out.print("ID: " + obj.getCar_id() + " ");
				System.out.print("|| Make: " + obj.getCar_make() + " ");
				System.out.print("|| Model: " + obj.getCar_model() + " ");
				System.out.print("|| Colour: " + obj.getCar_colour() + " ");
				System.out.print("|| Cost: " + obj.getCar_cost());
				System.out.println();
				System.out.println("============================================================================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoggerPage.Log4("info", "Employee " + empUN + " has viewed all cars in lot");
		System.out.println("Return to Employee Menu? [Y/N]");
		String a = scan.nextLine();
		if (a.equalsIgnoreCase("y")) {
			EmployeeMenu.employeeMenu(empUN);
		}else if (a.equalsIgnoreCase("n")) {
			LoggerPage.Log4("info", "Application closed, all users logged out");
			System.out.println("Exiting Application");
		}else {
			System.out.println("Invalid Entry");
			System.out.println("Returning to Employee Menu");
			EmployeeMenu.employeeMenu(empUN);
		}
			
	}
}
