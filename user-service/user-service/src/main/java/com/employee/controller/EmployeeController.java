package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.VO.ResponseTempleteVO;
import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/")
	//@CircuitBreaker(name = "employeeBreaker", fallbackMethod = "employeeServiceFallBackMethod")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return employeeService.saveEmployee(employee);
		 
	}
	
	@GetMapping("/{id}")
	//@CircuitBreaker(name = "employeeBreaker", fallbackMethod = "employeeServiceFallBackMethod")
	public ResponseTempleteVO getEmployeeWithDepartment(@PathVariable ("id") Long employeeId) {
		
		return employeeService.getEmployeeWithDepartment(employeeId);
	}

//		public String employeeServiceFallBackMethod(Employee department, Exception e) {
//		
//		return "Employee service taking longer time";
//		
//	}

}
