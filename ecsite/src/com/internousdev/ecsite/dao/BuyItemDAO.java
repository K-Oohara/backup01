package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyItemDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private BuyItemDTO buyItemDTO = new BuyItemDTO();

	/**
	 * 商品情報取得メソッド
	 *
	 * @return BuyItemDTO
	 */
	public BuyItemDTO getBuyItemInfo() {

		String sql = "SELECT id, item_name, item_price FROM item_info_transaction";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			//ResultSetの行数出力
			//resultSet.last();
			//int numberOfRows = resultSet.getRow();
			//System.out.println("ResultSetの行数" + numberOfRows);
			//resultSet.beforeFirst();

			while(resultSet.next()) {
				buyItemDTO.setId(resultSet.getInt("id"));
				buyItemDTO.setItemName(resultSet.getString("item_name"));
				buyItemDTO.setItemPrice(resultSet.getString("item_price"));

				//buyItemDTOデータ確認用
				//System.out.println(buyItemDTO.getId());
				//System.out.println(buyItemDTO.getItemName());
				//System.out.println(buyItemDTO.getItemPrice());
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return buyItemDTO;
	}

	public BuyItemDTO getBuyItemDTO() {
		return buyItemDTO;
	}
}