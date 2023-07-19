package com.abhi.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhi.department.entity.Department;
import com.abhi.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		
		//log.info("Inside savedepartment of DepartmentService");
		return departmentRepository.save(department);
	}

	public Department findByDepartmentId(Long departmentId) {
		
		return departmentRepository.findByDepartmentId(departmentId);
	}

}
