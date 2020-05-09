package com.revature.dao.dao;

import java.sql.SQLException;

public interface CustomerDAO {
	public void createCustomer (String nameFirst, String nameLast, String uName, String password) throws SQLException;
}
