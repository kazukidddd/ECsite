package com.internousdev.ecsite.action;

import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.internousdev.ecsite.dao.ItemListDAO;
import com.internousdev.ecsite.dto.ItemInfoDTO;

import java.util.ArrayList;
import java.util.Map;
import java.sql.SQLException;

public class ItemListAction extends ActionSupport implements SessionAware {
	private Map<String,Object> session;
	private ArrayList<ItemInfoDTO>itemList = new ArrayList<ItemInfoDTO>();

	public String execute() throws SQLException {
		ItemListDAO itemListDAO = new ItemListDAO();


		itemList = itemListDAO.getItemList();
		session.put("itemList", itemList);



		String result=SUCCESS;
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<ItemInfoDTO> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<ItemInfoDTO> itemList) {
		this.itemList = itemList;
	}

}
