package com.revature.menus.employee;

import java.util.Scanner;

import com.revature.beans.EmployeeBean;
import com.revature.files.UserLists;

public class EmployeeLoginMenu {

	static Scanner sc = new Scanner(System.in);
	
	public static void employeeLoginMenu() {
		System.out.println("===========================");
		System.out.println("    Employee Login Menu    ");
		System.out.println("===========================");
		System.out.println(" ");
		System.out.println("Please Enter your username");
		String nameU = sc.nextLine();
		System.out.println("Please Enter your password");
		String pass = sc.nextLine();
		EmployeeBean b = UserLists.LoginEmployee(nameU, pass);
//		
//		try {
//			System.out.println(b.toString());
//		}catch(NullPointerException n) {
//			return;
//		}
		
		
//		if (b.getuName().equals(nameU)) {
//			EmployeeMenu.employeeMenu();	
//		}else if(a.getuName().equals(nameU)) {
//			System.out.println("CUST SCREEN");
//		}else {
//			System.out.println("Invalid login");
//			loginMenu();
//		}
	}
}
