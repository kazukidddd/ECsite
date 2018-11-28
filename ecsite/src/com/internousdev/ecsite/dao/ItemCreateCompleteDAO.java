package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ItemCreateCompleteDAO {
	DateUtil dateUtil = new DateUtil();


	public void itemCreate(String itemName, String itemPrice, String itemStock)throws SQLException {
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();


		String sql = "INSERT INTO item_info_transaction(item_name, item_price, item_stock, insert_date) VALUES(?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, itemName);
			ps.setString(2, itemPrice);
			ps.setString(3, itemStock);
			ps.setString(4, dateUtil.getDate());

			ps.execute();


		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}

	}
}
