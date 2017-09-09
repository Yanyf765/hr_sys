package cn.itcast.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.SessionFactory;

import cn.itcast.dao.IBaseDao;
/**
 * ����dao��ͨ�ò���,ϣ�����е�dao�̳д���
 * 
 */
public class BaseDao<T> implements IBaseDao<T> {
	
	//��ǰ������ʵ�ʵ�bean����
	private Class<T> clazz;
	//��ȡ������
	private String className;
	
	//���䷺��
	public BaseDao(){
		Type type = this.getClass().getGenericSuperclass();
		//ת��Ϊ����������
		ParameterizedType pt = (ParameterizedType) type;
		//�õ�ʵ������
		Type types[] = pt.getActualTypeArguments();
		//��ȡʵ������
		clazz = (Class<T>) types[0];
		
		className = clazz.getSimpleName();
		
	}

	//����ע��
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
