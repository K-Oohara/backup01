package com.internousdev.ecsite.dto;

public class BuyItemDTO {
	private int id;
	private String buyItem_name;
	private int buyItem_price;
	private int buyItem_stock;

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}

	public String getItemName(){
		return buyItem_name;
	}
	public void setItemName(String buyItem_name){
		this.buyItem_name = buyItem_name;
	}

	public int getItemPrice(){
		return buyItem_price;
	}
	public void setItemPrice(int buyItem_price){
		this.buyItem_price = buyItem_price;
	}

	public int getItemStock(){
		return buyItem_stock;
	}
	public void setItemStock(int buyItem_stock){
		this.buyItem_stock = buyItem_stock;
	}
}
