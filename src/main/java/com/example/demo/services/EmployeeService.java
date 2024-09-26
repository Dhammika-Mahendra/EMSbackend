package com.example.demo.services;

import com.example.demo.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);

    EmployeeDTO getEmployeeById(int id);

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO updateEmployee(int id, EmployeeDTO employeeDTO);

    void deleteEmployee(int id);
}
