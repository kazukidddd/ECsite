package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;


public class ItemListDeleteCompleteDAO {
	private int res;
	public int deleteItemList() throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();

		String sql="DELETE FROM item_info_transaction ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			res = ps.executeUpdate();


		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return res;
	}

}
