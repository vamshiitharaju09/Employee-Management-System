package com.alpha.empManage.service;

import org.springframework.stereotype.Service;

import com.alpha.empManage.dto.EmployeeDto;
import com.alpha.empManage.entity.Employee;
import com.alpha.empManage.mapper.EmployeeMapper;
import com.alpha.empManage.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	private final EmployeeRepository repository;
	
    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

 // CREATE
    public EmployeeDto createEmployee(EmployeeDto dto) {
        Employee employee = EmployeeMapper.mapToEmployee(dto);
        Employee saved = repository.save(employee); 
        return EmployeeMapper.mapToEmployeeDto(saved);
    }
	

}
