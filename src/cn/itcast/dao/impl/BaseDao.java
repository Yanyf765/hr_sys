package cn.itcast.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.SessionFactory;

import cn.itcast.dao.IBaseDao;
/**
 * 所有dao的通用操作,希望所有的dao继承此类
 * 
 */
public class BaseDao<T> implements IBaseDao<T> {
	
	//当前操作的实际的bean类型
	private Class<T> clazz;
	//获取类名称
	private String className;
	
	//反射泛型
	public BaseDao(){
		Type type = this.getClass().getGenericSuperclass();
		//转换为参数化类型
		ParameterizedType pt = (ParameterizedType) type;
		//得到实际类型
		Type types[] = pt.getActualTypeArguments();
		//获取实际类型
		clazz = (Class<T>) types[0];
		
		className = clazz.getSimpleName();
		
	}

	//容器注入
	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	
	public void save(T emp) {
		sessionFactory.getCurrentSession().save(emp);
	}

	public void delete(int id) {
		sessionFactory
		.getCurrentSession()
		.createQuery("delete from " + className + " where id=?")
		.setParameter(0, id).executeUpdate();
	}

	public void update(T emp) {
		sessionFactory.getCurrentSession().save(emp);
	}

	public T findById(int id) {
		return (T) sessionFactory.getCurrentSession().get(clazz,id);
	}

	public List<T> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from " + className).list();
	}

}
