package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{
	String result = SUCCESS;
	private String itemName;
	private String itemPrice;
	private String itemStock;
	private Map<String,Object> session;

	public String execute() throws SQLException{
		ItemCreateCompleteDAO itemCreateCompleteDAO = new ItemCreateCompleteDAO();

		itemCreateCompleteDAO.itemCreate(
				session.get("itemName").toString(),
				session.get("itemPrice").toString(),
				session.get("itemStock").toString());


		return result;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemStock() {
		return itemStock;
	}

	public void setItemStock(String itemStock) {
		this.itemStock = itemStock;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
