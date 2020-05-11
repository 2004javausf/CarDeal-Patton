package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Employee;

public interface EmployeeDAO {
	public void createEmployee (String emp_name_first, String emp_name_last, String emp_user_name, String emp_pass_word) throws SQLException;
	
	public List<Employee> getEmployeeList() throws SQLException;
}


