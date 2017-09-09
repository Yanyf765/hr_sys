package cn.itcast.service;

import java.util.List;

import cn.itcast.entity.Employee;

public interface IEmployeeService {
    void save(Employee emp);

    void delete(int id);

    void delete(int[] ids);

    void update(Employee emp);

    Employee findById(int id);

    List<Employee> getAll();

    List<Employee> getAll(String employeeDao);
}
