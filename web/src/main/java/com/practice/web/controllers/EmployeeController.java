package com.practice.web.controllers;

import com.practice.web.entities.EmployeeEntity;
import com.practice.web.repositories.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/employees") // this is parent path so it will add before every get post path delete.... request
public class EmployeeController {

    EmployeeRepository employeeRepository;

    EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

//    @GetMapping(path = "/secret")
//    public String getMySuperSecretMessage() {
//        return "My Secret Message is : a@#$s$#@h@#$u%$#";
//    }

//    @GetMapping(path = "/")
//    public String home() {
//        return "Home Page";
//    }

    @GetMapping(path = "/{empID}")
    public EmployeeEntity getEmployee(@PathVariable Integer empID) {
        return employeeRepository.findById(empID).orElse(null);
    }

    @GetMapping(path = "/others")
    public String other() {
        return getEmployee(23).toString()+" ";
    }

    @GetMapping(path = "/")
    public List<EmployeeEntity> details(@RequestParam(required = false) String name, @RequestParam(required = false) Integer age, @RequestParam(required = false) boolean isActive) {
        return employeeRepository.findAll();
    }

    @PostMapping(path = "/create")
    public EmployeeEntity createEmployee(@RequestBody EmployeeEntity inputEmployee) {
        return employeeRepository.save(inputEmployee);
    }
}
