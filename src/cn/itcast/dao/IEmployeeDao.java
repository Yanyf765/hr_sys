package cn.itcast.dao;

import java.util.List;

import cn.itcast.entity.Employee;

public interface IEmployeeDao {
	/**
	 * ����
	 * @param employee
	 */
	void save(Employee employee);
	/**
	 * ɾ��
	 * @param id
	 */
	void delete(int id);
	/**
	 * ����
	 * @param employee
	 */
	void update(Employee employee);
	
	/**
	 * ��ѯȫ��
	 * @return
	 */
	List<Employee> getAll();
	/**
	 * ����id��ѯ
	 * @param id
	 * @return
	 */
	Employee findById(int id);
	/**
	 * �������ֲ�ѯ
	 * @param employeeName
	 * @return
	 */
	List<Employee> getAll(String employeeName);
}
