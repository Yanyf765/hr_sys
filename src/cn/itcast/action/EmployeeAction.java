package cn.itcast.action;

import cn.itcast.entity.Employee;
import cn.itcast.service.IEmployeeService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction extends ActionSupport implements
	ModelDriven<Employee> {

    // 1.��װ����
    private Employee employee = new Employee();
    private int deptId;

    public int getDeptId() {
	return deptId;
    }

    public void setDeptId(int deptId) {
	this.deptId = deptId;
    }

    public Employee getEmployee() {
	return employee;
    }

    public void setEmployee(Employee employee) {
	this.employee = employee;
    }

    public Employee getModel() {
	return employee;
    }

    // ע��Ա��Service
    private IEmployeeService employeeService;
}
