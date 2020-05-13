package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.Car;

public interface CarDAO {
	public void createCar (String car_make, String car_model, String car_colour, double car_cost) throws SQLException;
	
	public List<Car> getCarList() throws SQLException;
	
	public List<Car> viewOneCar(int car_id) throws SQLException;
	
	public void removeCar(int car_id) throws SQLException;
}

