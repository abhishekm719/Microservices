package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.employee.VO.Department;
import com.employee.VO.ResponseTempleteVO;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public ResponseTempleteVO getEmployeeWithDepartment(Long employeeId) {
		
		ResponseTempleteVO vo = new ResponseTempleteVO();
		Employee employee = employeeRepository.findByEmployeeId(employeeId);
		Department department=
				restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+ employee.getDepartmentId() , Department.class);
		vo.setEmployee(employee);
		vo.setDepartment(department);
		return vo;
	}
}
