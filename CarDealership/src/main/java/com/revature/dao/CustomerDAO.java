package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Customer;

public interface CustomerDAO {

		public void createCustomer(String cust_name_first, String cust_name_last, String cust_user_name, String cust_pass_word) throws SQLException;
		
		public List<Customer> getCustomerList() throws SQLException;
}
