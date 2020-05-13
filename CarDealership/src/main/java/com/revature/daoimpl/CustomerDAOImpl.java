package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Customer;
import com.revature.dao.CustomerDAO;

import connfactory.ConnFactory;

public class CustomerDAOImpl implements CustomerDAO {
	public static ConnFactory cf = ConnFactory.getInstance();
	
	@Override
	public void createCustomer(String cust_name_first, String cust_name_last, String cust_user_name, String cust_pass_word) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "INSERT INTO CUSTOMER VALUES (?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, cust_name_first);
		ps.setString(2, cust_name_last);
		ps.setString(3, cust_user_name);
		ps.setString(4, cust_pass_word);
		ps.executeUpdate();
	}
	@Override
	public List<Customer> getCustomerList() throws SQLException {
		List<Customer> customerList = new ArrayList<Customer>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
		Customer c = null;
		while (rs.next()) {
			c = new Customer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			customerList.add(c);
		}
		return customerList;
	}
	@Override
	public List<Customer> getOneCustomerList(String cust_user_name) throws SQLException {
		List<Customer> oneCustomerList = new ArrayList<Customer>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER WHERE (CUST_USER_NAME) = '" + cust_user_name + "'");
		Customer c1 = null;
		while (rs.next()) {
			c1 = new Customer(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			oneCustomerList.add(c1);
		}
		return oneCustomerList;
	}
}