package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dao.LoginDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ログイン認証処理
 * Login.jspからログインID、ログインパスワードを受け取り
 * DBへ問い合わせを行います。
 *
 * @author internous
 * @param loginUserId
 * @param loginPassword
 *
 * @return result
 */

public class LoginAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String errorMessage;

	private Map<String, Object> session;

	private LoginDAO loginDAO = new LoginDAO();
	private LoginDTO loginDTO = new LoginDTO();
	private BuyItemDAO buyItemDAO = new BuyItemDAO();

	public String execute(){
		String result = ERROR;
		//ログイン実行
		loginDTO = loginDAO.getLoginUserInfo(loginUserId, loginPassword);

		session.put("loginUser", loginDTO);

		//ログイン情報比較
		if(((LoginDTO) session.get("loginUser")).getLoginFlg()){
			result = SUCCESS;

			//アイテム情報取得
			BuyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();

			session.put("login_id",loginDTO.getLoginId());
			session.put("id",buyItemDTO.getId());
			session.put("item_name",buyItemDTO.getItemName());
			session.put("item_price",buyItemDTO.getItemPrice());
			session.put("item_stock",buyItemDTO.getItemStock());

			System.out.println("session.login_id: " + (session.get("login_id")));
			System.out.println("session.id: " + (session.get("id")));
			System.out.println("session.item_name: " + (session.get("item_name")));
			System.out.println("session.item_price: " + (session.get("item_price")));
			System.out.println("session.item_stock: " + (session.get("item_stock")));

			return result;
		}
		setErrorMessage("ユーザID・パスワードに誤りがあるか、登録されていません。");
		return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
