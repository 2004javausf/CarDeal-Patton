package com.revature.dao.dao;

import java.sql.SQLException;

public interface EmployeeDAO {
	
	public void createEmployee (String nameFirst, String nameLast, String uName, String password) throws SQLException;
}


