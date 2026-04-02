package com.alpha.empManage.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.alpha.empManage.dto.EmployeeDto;
import com.alpha.empManage.entity.Employee;
import com.alpha.empManage.exception.ResourceNotFoundException;
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
    
    
    // GET BY ID
    public EmployeeDto getEmployeeId(Long employeeId)
    {
    	 Employee employee=repository.findById(employeeId)
    	.orElseThrow(() -> 
    	      new ResourceNotFoundException("Employee not found with id: " + employeeId));
    	return EmployeeMapper.mapToEmployeeDto(employee);
    }
    
    //GET ALL DETAILS
    public List<EmployeeDto> getAllEmployees()
    {
            return repository.findAll()
                    .stream()
                    .map(EmployeeMapper::mapToEmployeeDto)
                    .collect(Collectors.toList());
        }
    
    //UPDATE EMPLOYEE
     public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee)
     {
    	Employee existing =repository.findById(employeeId)
    			 .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + employeeId));
    	existing.setFirstName(updatedEmployee.getFirstName());
    	existing.setLastName(updatedEmployee.getLastName());
    	existing.setEmail(updatedEmployee.getEmail());
    	Employee updated = repository.save(existing);
    	return EmployeeMapper.mapToEmployeeDto(updated);
     }
    }
	


