package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.dao.OwnedCarsDAO;

import connfactory.ConnFactory;

public class OwnedCarDAOImpl implements OwnedCarsDAO {
	ConnFactory cf = ConnFactory.getInstance();
	@Override
	public void createOwnedCar(String cust_user_name, int car_id, String car_make, String car_model, String car_colour,
			int month_payments_remaining, double monthly_payments, double payment_remaining) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "INSERT INTO OWNED_CARS VALUES (?,?,?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, cust_user_name);
		ps.setInt(2, car_id);
		ps.setString(3, car_make);
		ps.setString(4, car_model);
		ps.setString(5, car_colour);
		ps.setInt(6, month_payments_remaining);
		ps.setDouble(7, monthly_payments);
		ps.setDouble(8, payment_remaining);
		ps.executeUpdate();
	}

}
