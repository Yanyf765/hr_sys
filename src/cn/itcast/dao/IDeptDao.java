package cn.itcast.dao;

import java.util.List;

import cn.itcast.entity.Dept;

/**
 * 部门模块接口设计
 * @author Administrator
 *
 */
public interface IDeptDao {
	/**
	 * 查询全部
	 * @return
	 */
	List<Dept> getAll();
	/**
	 * 根据主键查询
	 * @param id
	 * @return
	 */
	Dept findById(int id);
}
