package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Employee;
import com.revature.dao.EmployeeDAO;

import connfactory.ConnFactory;

public class EmployeeDAOImpl implements EmployeeDAO {
	public static ConnFactory cf = ConnFactory.getInstance();
	@Override
	public void createEmployee(String emp_name_first, String emp_name_last, String emp_user_name, String emp_pass_word) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "INSERT INTO EMPLOYEE VALUES (?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, emp_name_first);
		ps.setString(2, emp_name_last);
		ps.setString(3, emp_user_name);
		ps.setString(4, emp_pass_word);
		ps.executeUpdate();
	}
	@Override
	public List<Employee> getEmployeeList() throws SQLException {
		List<Employee> employeeList = new ArrayList<Employee>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE");
		Employee e = null;
		while (rs.next()) {
			e = new Employee (rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			employeeList.add(e);
		}
		return employeeList;
	}
	
	
	
}
