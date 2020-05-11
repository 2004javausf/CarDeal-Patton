package com.revature.dao.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.connfactory.ConnFactory;
import com.revature.dao.dao.EmployeeDAO;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	public static ConnFactory cf = ConnFactory.getInstance();

	@Override
	public void createEmployee(String nameFirst, String nameLast, String uName, String password) throws SQLException {
		Connection conn = cf.getConnection();
		String sql =  "INSERT INTO EMPLOYEE VALUES (?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, nameFirst);
		ps.setString(2, nameLast);
		ps.setString(3, uName);
		ps.setString(4, password);
		ps.executeUpdate();
		
	}
	
	
}
