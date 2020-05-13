package com.revature.menu.loginmenu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.daoimpl.CustomerDAOImpl;
import com.revature.daoimpl.EmployeeDAOImpl;
import com.revature.logger.LoggerPage;
import com.revature.menu.EmployeeMenu;
import com.revature.menu.OpenMenu;

public class CreateEmpLogin {
	static Scanner scan = new Scanner(System.in);
	public static void createEmpLogin (String emp_user_name) {
		String empUN = emp_user_name;
		System.out.println("===================================");
		System.out.println("      New Employee Creator");
		System.out.println("===================================");
		System.out.println("");
		System.out.println("Please Enter Employee's First Name");
		String d = scan.nextLine();
		System.out.println("Please Enter Employee's Last Name");
		String e = scan.nextLine();
		System.out.println("Please Enter a Username");
		String b = scan.nextLine();
		System.out.println("Please Enter a Password");
		String c = scan.nextLine();
		System.out.println(d + " " + e + ", you have entered " + b + " as your username and " + c + " as your password.");
		System.out.println("Please confirm this information is correct and you wish to continue [Y/N]");
		String f = scan.nextLine();
		if (f.equalsIgnoreCase("y")) {
			EmployeeDAOImpl edi = new EmployeeDAOImpl();
			try {
				edi.createEmployee(d, e, b, c);
			} catch (SQLException e1) {
				System.out.println("Username already in use");
				System.out.println("Returning to Employee Menu");
				EmployeeMenu.employeeMenu(empUN);
				e1.printStackTrace();
			}
			System.out.println("Employee Login information created");
			System.out.println("Returning to Start Menu");
			LoggerPage.Log4("info", "Employee " + d + " " + e + " with username: " + b + "has been created");
			OpenMenu.openMenu();
		}else if(f.equalsIgnoreCase("n")) {
			System.out.println("Returning to Employee Menu");
			EmployeeMenu.employeeMenu(empUN);;
		}else {
			System.out.println("Invalid entry");
			System.out.println("Returning to Employee Menu");
			EmployeeMenu.employeeMenu(empUN);;
		}
	}
}
