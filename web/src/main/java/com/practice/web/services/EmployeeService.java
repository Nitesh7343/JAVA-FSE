package com.practice.web.services;

import com.practice.web.entities.EmployeeEntity;
import com.practice.web.repositories.EmployeeRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class EmployeeService {
    EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeEntity getEmployee(Integer empID) {
        return employeeRepository.findById(empID).orElse(null);
    }

    public String other() {
        return getEmployee(1).toString()+" ";
    }


    public List<EmployeeEntity> details() {
        return employeeRepository.findAll();
    }


    public EmployeeEntity createEmployee(EmployeeEntity inputEmployee) {
        return employeeRepository.save(inputEmployee);
    }
}
