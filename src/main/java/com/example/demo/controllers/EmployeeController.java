package com.example.demo.controllers;


import com.example.demo.dto.EmployeeDTO;
import com.example.demo.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    // Build Add Employee REST API
     @PostMapping
    public ResponseEntity<EmployeeDTO> createEmployee (@RequestBody EmployeeDTO employeeDto){
        EmployeeDTO savedEmployee = employeeService.createEmployee (employeeDto);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}