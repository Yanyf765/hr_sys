package cn.itcast.dao;

import java.util.List;

import cn.itcast.entity.Dept;

/**
 * ����ģ��ӿ����
 * @author Administrator
 *
 */
public interface IDeptDao {
	/**
	 * ��ѯȫ��
	 * @return
	 */
	List<Dept> getAll();
	/**
	 * ����������ѯ
	 * @param id
	 * @return
	 */
	Dept findById(int id);
}
