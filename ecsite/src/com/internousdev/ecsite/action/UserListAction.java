package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.UserListDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import java.sql.SQLException;



public class UserListAction extends ActionSupport implements SessionAware{
	private ArrayList<UserInfoDTO>userInfoList = new ArrayList<UserInfoDTO>();
	private Map<String,Object> session;

	public String execute() throws SQLException{
		UserListDAO userListDAO = new UserListDAO();
		String result = SUCCESS;

		userInfoList = userListDAO.getUserList();
		session.put("userInfoList", userInfoList);

		return result;


	}

	public ArrayList<UserInfoDTO> getUserInfoList() {
		return userInfoList;
	}

	public void setUserInfoList(ArrayList<UserInfoDTO> userInfoList) {
		this.userInfoList = userInfoList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
