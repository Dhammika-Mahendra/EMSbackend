package com.example.demo.services.impl;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entities.Employee;
import com.example.demo.exceptions.ResourseNotFoundException;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDTO getEmployeeById(int id) {
        Employee employee=employeeRepository.findById(id)
                .orElseThrow(()-> new ResourseNotFoundException("Employee not found"));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
