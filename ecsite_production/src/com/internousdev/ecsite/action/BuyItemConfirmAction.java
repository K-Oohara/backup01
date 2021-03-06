package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();

	public String execute(){

		//商品購入情報をDB:user_buy_item_transactionに格納する。
		buyItemCompleteDAO.setUserBuyItem(
				session.get("id").toString(),			//item_transaction_id
				session.get("total_price").toString(),	//total_price
				session.get("count").toString(),		//total_count
				session.get("login_id").toString(),		//user_master_id
				session.get("pay").toString()			//pay
				);

		return SUCCESS;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}
}