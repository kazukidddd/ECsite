package com.internousdev.ecsite.action;

import com.internousdev.ecsite.dao.ItemListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.ecsite.dto.ItemInfoDTO;
import java.util.ArrayList;
import java.sql.SQLException;
import java.util.Map;

public class ItemListDeleteCompleteAction extends ActionSupport implements SessionAware{
	private ArrayList<ItemInfoDTO> itemList = new ArrayList<ItemInfoDTO>();
	int res =0;
	private String message;
	private Map<String,Object>session;

	public String execute() throws SQLException{
		ItemListDeleteCompleteDAO itemListDeleteCompleteDAO = new ItemListDeleteCompleteDAO();

		res = itemListDeleteCompleteDAO.deleteItemList();

				if(res>0) {
					setMessage("削除できました。");
				}else if(res==0) {
					setMessage("削除できませんでした。");
				}
				String result =SUCCESS;
				return result;
	}

	public ArrayList<ItemInfoDTO> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<ItemInfoDTO> itemList) {
		this.itemList = itemList;
	}

	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
