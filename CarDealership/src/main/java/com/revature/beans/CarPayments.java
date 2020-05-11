package com.revature.beans;

public class CarPayments {
	private String cust_name_first;
	private String cust_name_last;
	private String cust_user_name;
	private int car_id;
	private double car_initial_cost;
	private double monthly_payment;
	private double months_remaining;
	private double car_remaining_balance;
	
	
	public CarPayments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CarPayments(String cust_name_first, String cust_name_last, String cust_user_name, int car_id,
			double car_initial_cost, double monthly_payment, double months_remaining, double car_remaining_balance) {
		super();
		this.cust_name_first = cust_name_first;
		this.cust_name_last = cust_name_last;
		this.cust_user_name = cust_user_name;
		this.car_id = car_id;
		this.car_initial_cost = car_initial_cost;
		this.monthly_payment = monthly_payment;
		this.months_remaining = months_remaining;
		this.car_remaining_balance = car_remaining_balance;
	}
	public String getCust_name_first() {
		return cust_name_first;
	}
	public void setCust_name_first(String cust_name_first) {
		this.cust_name_first = cust_name_first;
	}
	public String getCust_name_last() {
		return cust_name_last;
	}
	public void setCust_name_last(String cust_name_last) {
		this.cust_name_last = cust_name_last;
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
	public double getCar_initial_cost() {
		return car_initial_cost;
	}
	public void setCar_initial_cost(double car_initial_cost) {
		this.car_initial_cost = car_initial_cost;
	}
	public double getMonthly_payment() {
		return monthly_payment;
	}
	public void setMonthly_payment(double monthly_payment) {
		this.monthly_payment = monthly_payment;
	}
	public double getMonths_remaining() {
		return months_remaining;
	}
	public void setMonths_remaining(double months_remaining) {
		this.months_remaining = months_remaining;
	}
	public double getCar_remaining_balance() {
		return car_remaining_balance;
	}
	public void setCar_remaining_balance(double car_remaining_balance) {
		this.car_remaining_balance = car_remaining_balance;
	}
	@Override
	public String toString() {
		return "CarPayments [cust_name_first=" + cust_name_first + ", cust_name_last=" + cust_name_last
				+ ", cust_user_name=" + cust_user_name + ", car_id=" + car_id + ", car_initial_cost=" + car_initial_cost
				+ ", monthly_payment=" + monthly_payment + ", months_remaining=" + months_remaining
				+ ", car_remaining_balance=" + car_remaining_balance + "]";
	}
	
	
}
