package com.practice.web.controllers;

import com.practice.web.dto.EmployeeDTO;
import com.practice.web.entities.EmployeeEntity;
import com.practice.web.repositories.EmployeeRepository;
import com.practice.web.services.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/employees") // this is parent path so it will add before every get post path delete.... request
public class EmployeeController {

    //EmployeeRepository employeeRepository;

//    EmployeeController(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
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
    public EmployeeDTO getEmployee(@PathVariable Integer empID) {
        return employeeService.getEmployee(empID);
    }

    @GetMapping(path = "/others")
    public String other() {
        return getEmployee(1).toString()+" ";
    }

    @GetMapping(path = "/")
    public List<EmployeeDTO> details(@RequestParam(required = false) String name, @RequestParam(required = false) Integer age, @RequestParam(required = false) boolean isActive) {
        return employeeService.details();
    }

    @PostMapping(path = "/create")
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO inputEmployee) {
        return employeeService.createEmployee(inputEmployee);
    }

    @PutMapping(path = "/{employeeID}")
    EmployeeDTO updateEmployeebyId(@RequestBody EmployeeDTO employeeDTO,@PathVariable Integer employeeID){
        return employeeService.updateEmployeeById(employeeDTO,employeeID);
    }

    @DeleteMapping(path = "/{employeeID}")
    String deleteEmployeeById(@PathVariable Integer employeeID){
        return employeeService.deleteEmployeeById(employeeID) ? "Employee with EmployeeID " + employeeID + " Deleted." : "No employee exist with this ID";
    }
//.............................................to be implemneted/.........................................
//    @PatchMapping(path = "/{employeeID}")
//    EmployeeDTO editEmployeeById(@RequestBody Map<String,Object> updates, @PathVariable Integer employeeID){
//        return employeeService.editEmployeeById(updates,employeeID);
//    }
// .............................................to be implemneted/.........................................
}
