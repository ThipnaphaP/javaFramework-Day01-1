package com.example.demoapp.employees;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

//	List<Employee> findById(int id, String name){
//		
//	}
	
}
