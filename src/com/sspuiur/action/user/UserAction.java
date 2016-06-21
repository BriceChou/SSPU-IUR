/* 
  @author 周明亮
  @datetime 2016年3月27日 下午12:59:58
 */

package com.sspuiur.action.user;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.sspuiur.model.SspuIurUser;
import com.sspuiur.service.user.UserService;
import com.sspuiur.util.MD5Util;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Map<String, Object> map = new HashMap<String, Object>();

	public UserService service;

	private String username;
	private String password;
	private String mail;
	private String loginMessage;
	private String result;

	public String register() {

		SspuIurUser user = new SspuIurUser();
		user.setUsername(username);
		user.setPassword(MD5Util.toMD5(password));
		service.addUser(user);
		return SUCCESS;
	}

	public String checkUser() {
		SspuIurUser user = new SspuIurUser();
		user.setUsername(username);
		user.setPassword(MD5Util.toMD5(password));
		service.checkUser(user);
		return SUCCESS;
	}

	/*********************** 以下为SET 和GET 函数 ******************************/

	public UserService getService() {
		return service;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	public String getLoginMessage() {
		return loginMessage;
	}

	public void setLoginMessage(String loginMessage) {
		this.loginMessage = loginMessage;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@RequiredStringValidator(message = "请输入用户名!")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@RequiredStringValidator(message = "请输入密码!")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
