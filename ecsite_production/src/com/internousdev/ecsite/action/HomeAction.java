package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	public BuyItemDAO buyItemDAO = new BuyItemDAO();

	/**
	 * ログインボタン押下時に実行
	 * ログイン画面に推移。
	 *
	 * @return SUCCESS
	 * */

	public String execute(){
		String result = "login";
		if (session.containsKey("id")){
			//アイテム情報取得
			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();

			session.put("id",buyItemDTO.getId());
			session.put("item_name",buyItemDTO.getItemName());
			session.put("item_price",buyItemDTO.getItemPrice());
			session.put("item_stock",buyItemDTO.getItemStock());

			System.out.println("session.id: " + (session.get("id")));
			System.out.println("session.item_name: " + (session.get("item_name")));
			System.out.println("session.item_price: " + (session.get("item_price")));
			System.out.println("session.item_stock: " + (session.get("item_stock")));

			result = SUCCESS;
		}
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public void setsession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getsession() {
		return this.session;
	}
}
