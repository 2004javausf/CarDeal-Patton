package driver;

import java.sql.SQLException;

import com.revature.dao.daoimpl.EmployeeDAOImpl;

public class Driver {
	
	public static void main(String[] args) {
		//new EmployeeBean("Zach", "Patton", "ZP", "pass");
		//new CustomerBean("Alex", "Dog", "AD", "pass");
		//EmployeeToFile.readEmployeeFile();
		//CustomerToFile.readCustomerFile();
		
		//System.out.println(UserLists.employeeFile.toString());
		//System.out.println(UserLists.customerFile.toString());
		//MainMenu.mainMenu();
		
		EmployeeDAOImpl edi = new EmployeeDAOImpl();
		
		try {
			edi.createEmployee("Zach", "Patton", "ZP", "pass");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
