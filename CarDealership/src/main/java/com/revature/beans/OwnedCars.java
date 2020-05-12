package com.revature.beans;

public class OwnedCars {
	private String cust_user_name;
	private int car_id;
	private String car_make;
	private String car_model;
	private String car_colour;
	private int month_payments_remaining;
	private double monthly_payments;
	private double payment_remaining;
	
	
	public OwnedCars() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OwnedCars(String cust_user_name, int car_id, String car_make, String car_model, String car_colour,
			int month_payments_remaining, double monthly_payments, double payment_remaining) {
		super();
		this.cust_user_name = cust_user_name;
		this.car_id = car_id;
		this.car_make = car_make;
		this.car_model = car_model;
		this.car_colour = car_colour;
		this.month_payments_remaining = month_payments_remaining;
		this.monthly_payments = monthly_payments;
		this.payment_remaining = payment_remaining;
	}
	public String getCust_user_name() {
		return cust_user_name;
	}
	public void setCust_user_name(String cust_user_name) {
		this.cust_user_name = cust_user_name;
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
	public String getCar_colour() {
		return car_colour;
	}
	public void setCar_colour(String car_colour) {
		this.car_colour = car_colour;
	}
	public int getMonth_payments_remaining() {
		return month_payments_remaining;
	}
	public void setMonth_payments_remaining(int month_payments_remaining) {
		this.month_payments_remaining = month_payments_remaining;
	}
	public double getMonthly_payments() {
		return monthly_payments;
	}
	public void setMonthly_payments(double monthly_payments) {
		this.monthly_payments = monthly_payments;
	}
	public double getPayment_remaining() {
		return payment_remaining;
	}
	public void setPayment_remaining(double payment_remaining) {
		this.payment_remaining = payment_remaining;
	}
	@Override
	public String toString() {
		return "OwnedCars [cust_user_name=" + cust_user_name + ", car_id=" + car_id + ", car_make=" + car_make
				+ ", car_model=" + car_model + ", car_colour=" + car_colour + ", month_payments_remaining="
				+ month_payments_remaining + ", monthly_payments=" + monthly_payments + ", payment_remaining="
				+ payment_remaining + "]";
	}
	
}
