package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	/**
	 * ログインボタン押下時に実行
	 * ログイン画面に推移。
	 *
	 * @return SUCCESS
	 * */

	public String execute(){
		String result = "login";
		if (session.containsKey("id")){
			//アイテム情報を取得














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
