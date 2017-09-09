package cn.itcast.dao.impl;

import org.hibernate.SessionFactory;

import cn.itcast.dao.IAdminDao;
import cn.itcast.entity.Admin;

public class AdminDao implements IAdminDao {

	//IOC»›∆˜(“¿¿µ)◊¢»ÎSessionFactory∂‘œÛ
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Admin admin) {
		sessionFactory.getCurrentSession().save(admin);
	}

	public Admin findByIdAdmin(Admin admin) {
		Admin admin1 = (Admin)sessionFactory.getCurrentSession()
						.createQuery("from Admin where adminName=? and pwd=?")
						.setString(0, admin.getAdminName())
						.setString(1, admin.getPwd())
						.uniqueResult();
		return admin1;
	}

}
