package com.revature.beans;

public class OfferPro {
	private String cust_user_name;
	private int car_id;
	private double cust_bid;
	private String offer_pending;
	
	
	public OfferPro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OfferPro(String cust_user_name, int car_id, double cust_bid, String offer_pending) {
		super();
		this.cust_user_name = cust_user_name;
		this.car_id = car_id;
		this.cust_bid = cust_bid;
		this.offer_pending = offer_pending;
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
	public double getCust_bid() {
		return cust_bid;
	}
	public void setCust_bid(double cust_bid) {
		this.cust_bid = cust_bid;
	}
	public String getOffer_pending() {
		return offer_pending;
	}
	public void setOffer_pending(String offer_pending) {
		this.offer_pending = offer_pending;
	}
	@Override
	public String toString() {
		return "OfferPro [cust_user_name=" + cust_user_name + ", car_id=" + car_id + ", cust_bid=" + cust_bid
				+ ", offer_pending=" + offer_pending + "]";
	}
	
}
