package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Car;
import com.revature.dao.CarDAO;

import connfactory.ConnFactory;

public class CarDAOImpl implements CarDAO{
	ConnFactory cf = ConnFactory.getInstance();
	@Override
	public void createCar(String car_make, String car_model, String car_colour, double car_cost) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "INSERT INTO CAR VALUES (CARSEQ.NEXTVAL, ?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, car_make);
		ps.setString(2, car_model);
		ps.setString(3, car_colour);
		ps.setDouble(4, car_cost);
		ps.executeUpdate();
	}

	@Override
	public List<Car> getCarList() throws SQLException {
		List<Car> carList = new ArrayList<Car>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM CAR");
		Car ca = null;
		while (rs.next()) {
			ca = new Car(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
			carList.add(ca);
		}
		return carList;
	}

	@Override
	public void removeCar(int car_id) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "DELETE FROM OFFER WHERE CAR_ID = (?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, car_id);
		ps.executeUpdate();
		String sql1 = "DELETE FROM CAR WHERE CAR_ID = (?)";
		PreparedStatement ps1 = conn.prepareStatement(sql1);
		ps1.setInt(1, car_id);
		ps1.executeUpdate();
		
	}

	@Override
	public List<Car> viewOneCar(int car_id) throws SQLException {
		List<Car> carList1 = new ArrayList<Car>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM CAR WHERE (CAR_ID) = " + car_id );
		Car ca1 = null;
		while (rs.next()) {
			ca1 = new Car(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
			carList1.add(ca1);
		}
		return carList1;
	}
}
