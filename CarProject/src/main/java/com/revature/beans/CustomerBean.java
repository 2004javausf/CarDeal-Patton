package com.revature.beans;

import java.io.Serializable;

import com.revature.files.CustomerToFile;
import com.revature.files.UserLists;

public class CustomerBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -585121080027935018L;
	private String nameFirst;
	private String nameLast;
	private String uName;
	private String password;
	
	public CustomerBean() {
		super();
		UserLists.customerFile.add(this);
		CustomerToFile.writeCustomerFile(UserLists.customerFile);
	}
	
	public CustomerBean(String nameFirst, String nameLast, String uName, String password) {
		super();
		this.nameFirst = nameFirst;
		this.nameLast = nameLast;
		this.uName = uName;
		this.password = password;
		UserLists.customerFile.add(this);
		CustomerToFile.writeCustomerFile(UserLists.customerFile);
	}
	
	public String getNameFirst() {
		return nameFirst;
	}
	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}
	public String getNameLast() {
		return nameLast;
	}
	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "CustomerBean [nameFirst=" + nameFirst + ", nameLast=" + nameLast + ", uName=" + uName + ", password="
				+ password + "]";
	}
	
	
}
