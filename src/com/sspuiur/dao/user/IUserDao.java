/** 
 *@author 周明亮
 *@datetime  2016年3月27日 下午6:51:00
 */

package com.sspuiur.dao.user;

import com.sspuiur.model.SspuIurUser;

public interface IUserDao {

	/**
	 * 添加用户 并返回提示
	 * 
	 * @author 周明亮
	 * @datetime 2016年3月28日 上午9:02:15
	 * @return String
	 * @param user
	 * @return
	 */
	public String addUser(SspuIurUser user);

	/**
	 * 判断用户是否存在 目的：1、注册时检查当前用户名是否存在于数据库中
	 *
	 * @author 周明亮
	 * @datetime 2016年3月28日 上午10:01:07
	 * @return String
	 * @param username
	 * @return
	 */
	public String isExist(SspuIurUser user);

	/**
	 * 检查用户登录是否正确 1、登录时检查当前用户名、密码、状态是否正确 
	 * @author 周明亮
	 * @datetime 2016年3月28日 下午12:49:53
	 * @return String
	 * @param user
	 * @return
	 */
	public String checkUser(SspuIurUser user);

}
