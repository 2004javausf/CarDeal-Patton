package com.revature.beans;

public class CarBean {

	private int car_id;
	private String car_make;
	private String car_model;
	private int car_year;
	private String car_colour;
	private double car_cost;
	
	
	public CarBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarBean(int car_id, String car_make, String car_model, int car_year, String car_colour, double car_cost) {
		super();
		this.car_id = car_id;
		this.car_make = car_make;
		this.car_model = car_model;
		this.car_year = car_year;
		this.car_colour = car_colour;
		this.car_cost = car_cost;
	}
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public String getCar_make() {
		return car_make;
	}
	public void setCar_make(String car_make) {
		this.car_make = car_make;
	}
	public String getCar_model() {
		return car_model;
	}
	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}
	public int getCar_year() {
		return car_year;
	}
	public void setCar_year(int car_year) {
		this.car_year = car_year;
	}
	public String getCar_colour() {
		return car_colour;
	}
	public void setCar_colour(String car_colour) {
		this.car_colour = car_colour;
	}
	public double getCar_cost() {
		return car_cost;
	}
	public void setCar_cost(double car_cost) {
		this.car_cost = car_cost;
	}
	@Override
	public String toString() {
		return "CarBean [car_id=" + car_id + ", car_make=" + car_make + ", car_model=" + car_model + ", car_year="
				+ car_year + ", car_colour=" + car_colour + ", car_cost=" + car_cost + "]";
	}
	
	
}
