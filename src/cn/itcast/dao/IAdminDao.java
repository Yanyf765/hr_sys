package cn.itcast.dao;

import cn.itcast.entity.Admin;

/**
 * ����Աģ��dao�ӿ�
 * @author Administrator
 *
 */
public interface IAdminDao {
	/**
	 * ����
	 * 
	 */
	void save(Admin admin);
	/**
	 * ���ݹ���Ա��Ϣ��ѯ
	 * @param admin
	 * @return
	 */
	Admin findByIdAdmin(Admin admin);
}
