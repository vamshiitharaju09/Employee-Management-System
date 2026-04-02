package com.alpha.empManage.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.empManage.dto.EmployeeDto;
import com.alpha.empManage.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	   
	private final EmployeeService service;
	  
	public EmployeeController(EmployeeService service)
	{
		this.service=service;
	}
	
	// CREATE
    @PostMapping
    public EmployeeDto createEmployee(@RequestBody EmployeeDto dto) {
        return service.createEmployee(dto);
    }
    
 // GET BY ID
    @GetMapping("/{id}")
    public EmployeeDto getEmployeeById(@PathVariable ("id") Long employeeId) {
        return service.getEmployeeId(employeeId);
    }
    
    //GET ALL
    @GetMapping
    public List<EmployeeDto> getAllEmployees()
    {
    	return service.getAllEmployees();
    }
    
    //UPDATE EMPLOYEE BY ID
    @PutMapping("/{id}")
    public EmployeeDto updateEmployees(@PathVariable Long id,
            @RequestBody EmployeeDto dto) {
               return service.updateEmployee(id, dto);
}
}
