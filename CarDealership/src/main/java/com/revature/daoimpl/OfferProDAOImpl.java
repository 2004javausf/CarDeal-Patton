package com.revature.daoimpl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.OfferPro;
import com.revature.dao.OfferProDAO;

import connfactory.ConnFactory;

public class OfferProDAOImpl implements OfferProDAO{
	ConnFactory cf = ConnFactory.getInstance();
	@Override
	public void createOfferPro(String cust_user_id, int car_id, double cust_bid, String offer_pending) throws SQLException {
		Connection conn = cf.getConnection();
		String sql = "{ call OFFERPRO (?,?,?,?)";
		CallableStatement call = conn.prepareCall(sql);
		call.setString(1, cust_user_id);
		call.setInt(2, car_id);
		call.setDouble(3, cust_bid);
		call.setString(4, offer_pending);
		call.executeUpdate();
	}
	@Override
	public List<OfferPro> offerProListAll() throws SQLException {
		List<OfferPro> offerProListAll = new ArrayList<OfferPro>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM OFFER");
		OfferPro opa = null;
		while (rs.next()) {
			opa = new OfferPro(rs.getString(1), rs.getInt(2), rs.getDouble(3), rs.getString(4));
			offerProListAll.add(opa);
		}
		return offerProListAll;
	}
	
	@Override
	public List<OfferPro> offerProListCust(String cust_user_id) throws SQLException {
		List<OfferPro> offerProListCust = new ArrayList<OfferPro>();
		Connection conn = cf.getConnection();
		Statement stmt1 = conn.createStatement();
		ResultSet rs1 = stmt1.executeQuery("SELECT * FROM OFFER WHERE (CUST_USER_NAME) = '" + cust_user_id + "'");
		OfferPro opc = null;
		while (rs1.next()) {
			opc = new OfferPro(rs1.getString(1), rs1.getInt(2), rs1.getDouble(3), rs1.getString(4));
			offerProListCust.add(opc);
		}
		return offerProListCust;
	}
	@Override
	public List<OfferPro> offerProListDec(int car_id) throws SQLException {
		List<OfferPro> offerProListDec = new ArrayList<OfferPro>();
		Connection conn = cf.getConnection();
		Statement stmt2 = conn.createStatement();
		ResultSet rs2 = stmt2.executeQuery("SELECT * FROM OFFER WHERE (CAR_ID) = '" + car_id + "'");
		OfferPro opd = null;
		while (rs2.next()) {
			opd = new OfferPro(rs2.getString(1), rs2.getInt(2), rs2.getDouble(3), rs2.getString(4));
			offerProListDec.add(opd);
		}
		return offerProListDec;
	}
	@Override
	public List<OfferPro> offerProListChose(String cust_user_name, int car_id) throws SQLException {
		List<OfferPro> offerProListChose = new ArrayList<OfferPro>();
		Connection conn = cf.getConnection();
		Statement stmt3 = conn.createStatement();
		ResultSet rs3 = stmt3.executeQuery("SELECT * FROM OFFER WHERE (CAR_ID) = '" + car_id + "' AND (CUST_USER_NAME) = '" + cust_user_name + "'");
		OfferPro opc = null;
		while (rs3.next()) {
			opc = new OfferPro(rs3.getString(1), rs3.getInt(2), rs3.getDouble(3), rs3.getString(4));
			offerProListChose.add(opc);
		}
		return offerProListChose;
	}
}
