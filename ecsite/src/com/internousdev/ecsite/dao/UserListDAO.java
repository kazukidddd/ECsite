package com.internousdev.ecsite.dao;

import com.internousdev.ecsite.dto.UserInfoDTO;
import com.internousdev.ecsite.util.DBConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserListDAO{
	private ArrayList<UserInfoDTO> userInfoList = new ArrayList<UserInfoDTO>();

	public ArrayList<UserInfoDTO>getUserList() throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection con = dbConnector.getConnection();

		String sql ="SELECT * FROM login_user_transaction";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				UserInfoDTO dto = new UserInfoDTO();
				dto.setLoginId(rs.getString("login_id"));
				dto.setLoginPass(rs.getString("login_pass"));
				dto.setUserName(rs.getString("user_name"));
				dto.setInsertDate(rs.getString("insert_date"));
				userInfoList.add(dto);

			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
		return userInfoList;
	}
}
