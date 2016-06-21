/** 
   *@author 周明亮
   *@datetime  2016年3月27日 下午1:21:10
*/

package com.sspuiur.service.user;

import com.sspuiur.dao.user.IUserDao;
import com.sspuiur.model.SspuIurUser;

public class UserService {

	public IUserDao dao;

	public IUserDao getDao() {
		return dao;
	}

	public void setDao(IUserDao dao) {
		this.dao = dao;
	}

	/**
	 * 添加用户
	 * @author 周明亮
	 * @datetime 2016年3月28日 上午9:05:26
	 * @return void
	 * @param user
	 */
	public String addUser(SspuIurUser user) {
		return dao.addUser(user);
	}

	/**
	 * 检查用户
	 * @author 周明亮
	 * @datetime 2016年3月28日 下午1:06:10
	 * @return String
	 * @param user
	 * @return
	 */
	public String checkUser(SspuIurUser user) {
		return dao.checkUser(user);
	}
	/*********************** 以下为SET 和GET  函数******************************/

}
