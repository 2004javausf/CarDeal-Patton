package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.OwnedCars;

public interface OwnedCarsDAO {
	public void createOwnedCar (String cust_user_name, int car_id, String car_make, String car_model, String car_colour, int month_payments_remaining, double monthly_payments, double payment_remaining) throws SQLException;
	
	public List<OwnedCars> ownedCarsList() throws SQLException;
	
	public List<OwnedCars> ownedCarListCust(String cust_user_name) throws SQLException;
	
	public List<OwnedCars> ownedCarListCust1(int car_id) throws SQLException;
	
	public void paymentMade(String cust_user_name, int car_id, int month_payments_remaining, double payment_remaining) throws SQLException;
	
}
