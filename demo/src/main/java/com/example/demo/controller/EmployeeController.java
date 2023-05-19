package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService services;
	
	@GetMapping("/getall")
	public Iterable<Employee>getStudents(){
	return services.listAll();
	}

	@PostMapping(value = "/save")
		private long saveBook(@RequestBody Employee employees) {
		
		services.saveorUpdate(employees);
		return employees.getId();
	}
	
	
	@RequestMapping("/employee/{id}")  
	private Employee getEmployee(@PathVariable(name = "id") int employeeid)  
	{  
	return services.getEmployeeById(employeeid);  
	}  
	    
	@PutMapping("/edit/{id}")
	 
	    private Employee update(@RequestBody Employee employees,@PathVariable int id)  
	    {  
		employees.setId(id);
	   services.saveorUpdate(employees);  
	       return employees;  
	    }  
	 
	@DeleteMapping("/delete/{id}")  
	private void deleteStudent(@PathVariable("id") int id)  
	{  
	services.delete(id);  
	}  
	
}
