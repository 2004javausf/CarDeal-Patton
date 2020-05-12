package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.beans.OfferPro;

public interface OfferProDAO {
	public void createOfferPro(String cust_user_id, int car_id, double cust_bid, String offer_pending) throws SQLException;

	public List<OfferPro> offerProListAll() throws SQLException;
	
	public List<OfferPro> offerProListCust(String cust_user_name) throws SQLException;
	
	public List<OfferPro> offerProListDec(int car_id) throws SQLException;
	
	public List<OfferPro> offerProListChose(String cust_user_name, int car_id) throws SQLException;
}
