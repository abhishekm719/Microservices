package com.abhi.department.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abhi.department.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

	public Department findByDepartmentId(Long departmentId);

}
