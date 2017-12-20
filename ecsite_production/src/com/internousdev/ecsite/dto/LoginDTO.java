package com.internousdev.ecsite.dto;

public class LoginDTO {
	private String loginId;
	private String loginPassword;
	private String userName;
	private boolean loginFlg = false;


	public String getLoginId(){
		return loginId;
	}

	public void setLoginId(String id){
		this.loginId = id;
	}

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String password){
		this.loginPassword = password;
	}

	public String getLoginUserName(){
		return userName;
	}

	public void setLoginUserName(String name){
		this.userName = name;
	}

	public boolean getLoginFlg(){
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg){
		this.loginFlg = loginFlg;
	}
}
