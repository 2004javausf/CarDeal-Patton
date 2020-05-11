package com.revature.menu.loginmenu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.beans.Employee;
import com.revature.daoimpl.EmployeeDAOImpl;
import com.revature.menu.EmployeeMenu;

public class EmployeeLoginMenu {
	static Scanner scan = new Scanner(System.in);
	public static void employeeLoginMenu() {
		System.out.println("===================================");
		System.out.println("         Employee Login");
		System.out.println("===================================");
		System.out.println("");
		System.out.println("Please Enter Your Username");
		String a = scan.nextLine();
		System.out.println("Please Enter Your Username");
		String b = scan.nextLine();
		Employee c = EmployeeLoginMenu.el(a, b);
		if(c.getEmp_user_name().equals(a)){
			EmployeeMenu.employeeMenu();
		}else {
			System.out.println("Invalid Login");
			employeeLoginMenu();
		}
	}
	
	public static Employee el (String input_emp_user_name, String input_emp_pass_word) {
		EmployeeDAOImpl edi = new EmployeeDAOImpl();
		try {
			for (int i = 0; i < edi.getEmployeeList().size(); i++) {
				String emp_user_name = edi.getEmployeeList().get(i).getEmp_user_name();
				String emp_pass_word = edi.getEmployeeList().get(i).getEmp_pass_word();
				if(input_emp_user_name.equals(emp_user_name) && input_emp_pass_word.equals(emp_pass_word)) {
					return edi.getEmployeeList().get(i);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
