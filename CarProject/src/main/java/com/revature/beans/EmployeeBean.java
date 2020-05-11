package com.revature.beans;

public class EmployeeBean{
		
	private String nameFirst;
	private String nameLast;
	private String uName;
	private String password;
	
	public EmployeeBean() {
		super();
//		UserLists.employeeFile.add(this);
//		EmployeeToFile.writeEmployeeFile(UserLists.employeeFile);
	}

	public EmployeeBean(String nameFirst, String nameLast, String uName, String password) {
		super();
		this.nameFirst = nameFirst;
		this.nameLast = nameLast;
		this.uName = uName;
		this.password = password;
//		UserLists.employeeFile.add(this);
//		EmployeeToFile.writeEmployeeFile(UserLists.employeeFile);
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
		return "EmployeeBean [nameFirst=" + nameFirst + ", nameLast=" + nameLast + ", uName=" + uName + ", password="
				+ password + "]";
	}
}
