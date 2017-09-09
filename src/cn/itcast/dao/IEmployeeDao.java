package cn.itcast.dao;

import java.util.List;

import cn.itcast.entity.Employee;

public interface IEmployeeDao {
	/**
	 * 保存
	 * @param employee
	 */
	void save(Employee employee);
	/**
	 * 删除
	 * @param id
	 */
	void delete(int id);
	/**
	 * 更新
	 * @param employee
	 */
	void update(Employee employee);
	
	/**
	 * 查询全部
	 * @return
	 */
	List<Employee> getAll();
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	Employee findById(int id);
	/**
	 * 根据名字查询
	 * @param employeeName
	 * @return
	 */
	List<Employee> getAll(String employeeName);
}
