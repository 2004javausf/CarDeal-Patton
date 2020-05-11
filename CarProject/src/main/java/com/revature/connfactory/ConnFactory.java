package com.revature.connfactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnFactory {
	Scanner sc = new Scanner(System.in);
	
	private static ConnFactory cf = new ConnFactory();
	
	private ConnFactory() {
		super();
	}
	
	public static synchronized ConnFactory getInstance() {
		if (cf == null) {
			cf = new ConnFactory();
		}
		return cf;
	}
	
	public Connection getConnection() {
		
		String url = "jbdc:oracle:@cardealpropatton.cfsinz7mypos.us-east-2.rds.amazonaws.com:1521:ORCL";
		String user = "carpat";
		String pass = "AlexAnya_2";
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
