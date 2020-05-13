package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.OwnedCars;
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
	@Override
	public List<OwnedCars> ownedCarsList() throws SQLException {
		List<OwnedCars> ownedCarsList = new ArrayList<OwnedCars>();
		Connection conn =cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM OWNED_CARS");
		OwnedCars oc = null;
		while(rs.next()) {
			oc = new OwnedCars(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getDouble(7), rs.getDouble(8));
			ownedCarsList.add(oc);
		}
		return ownedCarsList;
	}
	@Override
	public List<OwnedCars> ownedCarListCust(String cust_user_name) throws SQLException {
		List<OwnedCars> ownedCarListCust = new ArrayList<OwnedCars>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM OWNED_CARS WHERE (CUST_USER_NAME) = '" + cust_user_name + "'");
		OwnedCars oc1 = null;
		while(rs.next()) {
			oc1 = new OwnedCars(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getDouble(7), rs.getDouble(8));
			ownedCarListCust.add(oc1);
		}
		return ownedCarListCust;
	}
	@Override
	public void paymentMade(String cust_user_name, int car_id, int month_payments_remaining, double payment_remaining) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "UPDATE OWNED_CARS SET MONTH_PAYMENTS_REMAINING = (?), PAYMENT_REMAINING = (?) WHERE CUST_USER_NAME = (?) AND CAR_ID = (?)";
		PreparedStatement ps1 = conn.prepareStatement(sql);
		ps1.setDouble(1, month_payments_remaining);
		ps1.setDouble(2, payment_remaining);
		ps1.setString(3, cust_user_name);
		ps1.setInt(4, car_id);
		ps1.executeUpdate();
	}
	@Override
	public List<OwnedCars> ownedCarListCust1(int car_id) throws SQLException {
		List<OwnedCars> ownedCarListCust = new ArrayList<OwnedCars>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM OWNED_CARS WHERE (CAR_ID) = '" + car_id + "'");
		OwnedCars oc1 = null;
		while(rs.next()) {
			oc1 = new OwnedCars(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getDouble(7), rs.getDouble(8));
			ownedCarListCust.add(oc1);
		}
		return ownedCarListCust;
	}

}
