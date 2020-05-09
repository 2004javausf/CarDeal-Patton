package com.revature.files;

import java.util.ArrayList;
import java.util.List;

import com.revature.beans.CustomerBean;
import com.revature.beans.EmployeeBean;

public class UserLists {
	public static List<CustomerBean> customerFile= new ArrayList<CustomerBean>();
	
	public static List<EmployeeBean> employeeFile = new ArrayList<EmployeeBean>();
	
	public static CustomerBean LoginCustomer(String inputUName, String inputPass) {
		for (int i = 0; i < customerFile.size(); i++) {
			String nameU = customerFile.get(i).getuName();
			String pass = customerFile.get(i).getPassword();
			if (inputUName.equals(nameU) && inputPass.equals(pass)) {
				return customerFile.get(i);
			}
		}
		return null;
	}
	
	public static EmployeeBean LoginEmployee(String inputUName, String inputPass) {
		for (int i = 0; i < employeeFile.size(); i++) {
			String nameU = employeeFile.get(i).getuName();
			String pass = employeeFile.get(i).getPassword();
			if (inputUName.equals(nameU) && inputPass.equals(pass)) {
				//System.out.println("worked");
				return employeeFile.get(i);
			}
		}
		//System.out.println("didnt work");
		return null;
		
	}
}
