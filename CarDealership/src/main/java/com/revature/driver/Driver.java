package com.revature.driver;

import java.sql.SQLException;

import com.revature.daoimpl.EmployeeDAOImpl;
import com.revature.menu.OpenMenu;

public class Driver {
	
	public static void main(String[] args) {
//		EmployeeDAOImpl edi = new EmployeeDAOImpl();
//	
//		try {
//			edi.createEmployee("Zach", "Patton", "ZP", "pass");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		OpenMenu.openMenu();
		
	}
}
