package com.sspuiur.dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

@Component
public abstract class BaseDao {

	protected SessionFactory sessionFactory;

	@Resource(name = "sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public <T> T findById(Serializable id, Class<T> clazz) {
		return (T) sessionFactory.getCurrentSession().get(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> findAll(Class<T> clazz) {
		return sessionFactory.getCurrentSession().createCriteria(clazz).list();
	}

	@SuppressWarnings("unchecked")
	public <T> T saveEntity(Object entity) {
		Session session = sessionFactory.getCurrentSession();
		T t = (T) session.merge(entity);
		session.flush();
		return t;
	}

	public <T> void removeEntity(Serializable id, Class<T> clazz) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(session.load(clazz, id));

	}

	public <T> void removeEntity(Object e) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(e);
	}

	@SuppressWarnings("unchecked")
	public <T> T addEntity(Object entity) {
		Session session = sessionFactory.getCurrentSession();
		T t = (T) session.save(entity);
		session.flush();
		return t;
	}

	public String add(Object t) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(t);
			tx.commit();
			return "添加信息成功！";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "添加当前信息失败，请重试或联系管理员！";
		} finally {
			session.close();
		}
	}

	public String save(Object t) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.merge(t);
			tx.commit();
			return "更改信息成功！";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "更改当前信息失败，请重试或联系管理员！";
		} finally {
			session.flush();
		}
	}

	public String delete(Object t) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		try {
			session.delete(t);
			tx.commit();
			return "删除信息成功！";
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return "删除当前信息失败，请重试或联系管理员！";
		} finally {
			session.close();
		}

	}

}
