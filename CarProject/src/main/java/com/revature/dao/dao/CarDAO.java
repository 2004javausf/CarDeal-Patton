package com.revature.dao.dao;

import java.sql.SQLException;

public interface CarDAO {
	public void createCar (int car_id, String car_make, String car_model, int car_year, String car_colour, double car_cost) throws SQLException;
}

