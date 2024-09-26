package com.example.demo.repositories;

import com.example.demo.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

//Get(inherit) the all predefined CRUD operation methods from JpaRepository
public interface EmployeeRepository extends JpaRepository <Employee,Integer>{

}