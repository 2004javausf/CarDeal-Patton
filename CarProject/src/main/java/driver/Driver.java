package driver;

import com.revature.beans.CustomerBean;
import com.revature.files.CustomerToFile;
import com.revature.files.EmployeeToFile;
import com.revature.files.UserLists;
import com.revature.menus.MainMenu;
import com.revature.menus.employee.EmployeeLoginMenu;

public class Driver {
	
	public static void main(String[] args) {
		//new EmployeeBean("Zach", "Patton", "ZP", "pass");
		//new CustomerBean("Alex", "Dog", "AD", "pass");
		//EmployeeToFile.readEmployeeFile();
		//CustomerToFile.readCustomerFile();
		
		//System.out.println(UserLists.employeeFile.toString());
		//System.out.println(UserLists.customerFile.toString());
		MainMenu.mainMenu();
		
		
	}
}
