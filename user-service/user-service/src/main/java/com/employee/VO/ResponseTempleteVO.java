package com.employee.VO;

import com.employee.entity.Employee;



public class ResponseTempleteVO {

	private Employee employee;
	private Department department;
	
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public ResponseTempleteVO(Employee employee, Department department) {
		super();
		this.employee = employee;
		this.department = department;
	}
	public ResponseTempleteVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ResponseTempleteVO [user=" + employee + ", department=" + department + "]";
	}
	
	
}
