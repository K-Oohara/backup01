package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DataUtil;

public class BuyItemCompleteDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private DataUtil dataUtil = new DataUtil();

	public void setUserBuyItem(String item_transaction_id, String total_price, String total_count, String user_master_id, String pay){

		String sql = "INSERT INTO user_buy_item_transaction (item_transaction_id, total_price, total_count, user_master_id, pay, insert_date) VALUE (?,?,?,?,?,?)";

		try{
			PreparedStatement ps = con.prepareStatement(sql);


			System.out.println(item_transaction_id);
			System.out.println(total_price);
			System.out.println(total_count);
			System.out.println(user_master_id);
			System.out.println(pay);
			System.out.println(dataUtil.getDate());




			ps.setString(1, item_transaction_id);
			ps.setString(2, total_price);
			ps.setString(3, total_count);
			ps.setString(4, user_master_id);
			ps.setString(5, pay);
			ps.setString(6, dataUtil.getDate());
			ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}

	}

}
