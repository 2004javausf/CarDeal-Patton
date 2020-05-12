package com.revature.dao;

import java.sql.SQLException;

public interface OwnedCarsDAO {
	public void createOwnedCar (String cust_user_name, int car_id, String car_make, String car_model, String car_colour, int month_payments_remaining, double monthly_payments, double payment_remaining) throws SQLException;
}
