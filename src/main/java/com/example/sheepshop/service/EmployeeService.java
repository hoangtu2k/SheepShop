package com.example.sheepshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sheepshop.entity.Employee;
import com.example.sheepshop.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    

    public void save(Employee employee) {
        employeeRepository.save(employee);
    }



}
