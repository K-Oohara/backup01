package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{
	private int count;
	private String pay;
	private Map<String, Object> session;

	public String execute(){

		session.put("count", count);
		int intCount = Integer.parseInt(session.get("count").toString());
		int intPrice = Integer.parseInt(session.get("item_price").toString());
		session.put("total_price", intCount * intPrice);

		switch(pay){
			case "cash":
				session.put("pay", "現金払い");
				break;

			case "credit":
				session.put("pay", "クレジット払い");
				break;
		}


		System.out.println("session.count: " + session.get("count"));
		System.out.println("session.total_price: " + (session.get("total_price")));
		System.out.println("session.pay: (" + pay + ", " + session.get("pay") + ")");


		return SUCCESS;
	}


	public int getCount(){
		return count;
	}
	public void setCount(int count){
		this.count = count;
	}

	public String getPay(){
		return pay;
	}
	public void setPay(String pay){
		this.pay = pay;
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}
}
