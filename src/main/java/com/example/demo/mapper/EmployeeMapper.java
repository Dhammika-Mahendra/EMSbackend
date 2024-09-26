package com.example.demo.mapper;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entities.Employee;

public class EmployeeMapper {
    public static EmployeeDTO mapToEmployeeDto(Employee employee) {
        return new EmployeeDTO(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }

    public static Employee mapToEmployee(EmployeeDTO employeeDTO) {
        return new Employee(
                employeeDTO.getId(),
                employeeDTO.getFirstName(),
                employeeDTO.getLastName(),
                employeeDTO.getEmail()
        );
    }
}