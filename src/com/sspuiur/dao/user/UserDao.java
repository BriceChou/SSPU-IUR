/** 
 *@author 周明亮
 *@datetime 2016年3月27日 下午1:17:21
 */

package com.sspuiur.dao.user;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.sspuiur.dao.BaseDao;
import com.sspuiur.model.SspuIurUser;
import com.sspuiur.util.TimeConfig;

public class UserDao extends BaseDao implements IUserDao {

	private SessionFactory sessionFactory;

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	/**
	 * @param user
	 * @author 周明亮
	 * @datetime 2016年3月27日 下午6:38:44
	 * @return void 增加用户信息
	 */
	public String addUser(SspuIurUser user) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Byte status = 1;
		user.setCreateTime(TimeConfig.StringToDate(sdf.format(new Date())));
		user.setCreator("admin_BriceChou");
		user.setStatus(status);

		try {
			session.save(user);
			tx.commit();
			return "User add successed.";
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback(); // 回滚事务
			}
			e.printStackTrace();
			return e.getMessage();
		} finally {
			session.close();
		}
	}

	@Override
	public String isExist(SspuIurUser user) {
		Session session = sessionFactory.openSession();
		StringBuffer hql = new StringBuffer();
		hql.append("from SspuIurUser as siu where 1=1");
		String result = "";
		if (!user.getUsername().isEmpty()) {
			hql.append("and siu.username = ' " + user.getUsername() + "'");
			Query query = session.createQuery(hql.toString());
			if (query.list().size() > 0) {
				result = "User is existed.";
			} else {
				result = "User is available.";
			}
		}
		return result;
	}

	@Override
	public String checkUser(SspuIurUser user) {
		Session session = sessionFactory.openSession();
		StringBuffer hql = new StringBuffer();
		hql.append("from SspuIurUser as siu where 1=1");
		String result = "";
		Byte status = 1;
		hql.append("and siu.username = ' " + user.getUsername() + "'");
		hql.append("and siu.password = ' " + user.getPassword() + "'");
		hql.append("and siu.status =  " + status);
		Query query = session.createQuery(hql.toString());
		if (query.list().size() > 0) {
			result = "SUCCESS";
		} else
			result = "INPUT";
		return result;
	}

	/*********************** 以下为SET 和GET 函数 ******************************/
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
