package com.revature.beans;

public class Customer {
	private String cust_name_first;
	private String cust_name_last;
	private String cust_user_name;
	private String cust_pass_word;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String cust_name_first, String cust_name_last, String cust_user_name, String cust_pass_word) {
		super();
		this.cust_name_first = cust_name_first;
		this.cust_name_last = cust_name_last;
		this.cust_user_name = cust_user_name;
		this.cust_pass_word = cust_pass_word;
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
	public String getCust_pass_word() {
		return cust_pass_word;
	}
	public void setCust_pass_word(String cust_pass_word) {
		this.cust_pass_word = cust_pass_word;
	}
	@Override
	public String toString() {
		return "Customer [cust_name_first=" + cust_name_first + ", cust_name_last=" + cust_name_last
				+ ", cust_user_name=" + cust_user_name + ", cust_pass_word=" + cust_pass_word + "]";
	}
	
	
}
