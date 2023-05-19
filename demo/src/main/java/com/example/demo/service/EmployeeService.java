package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	public Iterable<Employee> listAll(){
		return this.repo.findAll();
	}
	
	public void saveorUpdate(Employee employees) {
		repo.save(employees);
	}

	public Employee getEmployeeById(long id) {
		return repo.findById(id).get();
	}

	public void delete(long id) {
		repo.deleteById(id);  
		
	}
	
	
}
