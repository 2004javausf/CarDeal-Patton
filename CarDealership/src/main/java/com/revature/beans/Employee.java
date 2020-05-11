package com.revature.beans;

public class Employee {
	private String emp_name_first;
	private String emp_name_last;
	private String emp_user_name;
	private String emp_pass_word;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String emp_name_first, String emp_name_last, String emp_user_name, String emp_pass_word) {
		super();
		this.emp_name_first = emp_name_first;
		this.emp_name_last = emp_name_last;
		this.emp_user_name = emp_user_name;
		this.emp_pass_word = emp_pass_word;
	}
	public String getEmp_name_first() {
		return emp_name_first;
	}
	public void setEmp_name_first(String emp_name_first) {
		this.emp_name_first = emp_name_first;
	}
	public String getEmp_name_last() {
		return emp_name_last;
	}
	public void setEmp_name_last(String emp_name_last) {
		this.emp_name_last = emp_name_last;
	}
	public String getEmp_user_name() {
		return emp_user_name;
	}
	public void setEmp_user_name(String emp_user_name) {
		this.emp_user_name = emp_user_name;
	}
	public String getEmp_pass_word() {
		return emp_pass_word;
	}
	public void setEmp_pass_word(String emp_pass_word) {
		this.emp_pass_word = emp_pass_word;
	}
	@Override
	public String toString() {
		return "Employee [emp_name_first=" + emp_name_first + ", emp_name_last=" + emp_name_last + ", emp_user_name="
				+ emp_user_name + ", emp_pass_word=" + emp_pass_word + "]";
	}
	
	
}
