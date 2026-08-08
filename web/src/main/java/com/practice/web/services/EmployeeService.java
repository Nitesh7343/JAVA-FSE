package com.practice.web.services;

import com.practice.web.dto.EmployeeDTO;
import com.practice.web.entities.EmployeeEntity;
import com.practice.web.repositories.EmployeeRepository;
import org.apache.el.util.ReflectionUtil;
import org.modelmapper.ModelMapper;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    ModelMapper modelMapper = new ModelMapper();
    EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeDTO getEmployee(Integer empID) {
        EmployeeDTO employeeDTO = modelMapper.map(employeeRepository.findById(empID).orElse(null),EmployeeDTO.class);
        return employeeDTO;
    }

    public String other() {
        return getEmployee(1).toString()+" ";
    }


    public List<EmployeeDTO> details() {
        List<EmployeeEntity> employees = employeeRepository.findAll();

        return employees
                .stream()
                .map(employeeEntity -> modelMapper.map(employeeEntity,EmployeeDTO.class))
                .collect(Collectors.toList());
    }

    public EmployeeDTO createEmployee(EmployeeDTO inputEmployee) {
        EmployeeEntity employeeEntity = modelMapper.map(inputEmployee,EmployeeEntity.class);
        System.out.println("entity ======== " + employeeEntity);
        EmployeeEntity saved = employeeRepository.save(employeeEntity);
        System.out.println("saved =============" + saved);
        return modelMapper.map(saved, EmployeeDTO.class);
    }

    public EmployeeDTO updateEmployeeById(EmployeeDTO empDTO,Integer empID) {
        EmployeeEntity employeeEntity = modelMapper.map(empDTO, EmployeeEntity.class);
        employeeEntity.setId(empID);
        EmployeeEntity saved = employeeRepository.save(employeeEntity);
        return modelMapper.map(saved,EmployeeDTO.class);
    }

    boolean exists(Integer empID) {
        boolean exists = employeeRepository.existsById(empID);
        return exists;
    }

    public boolean deleteEmployeeById(Integer empID) {
        boolean exists = exists(empID);
        employeeRepository.deleteById(empID);
        return exists;
    }


//.............................................to be implemneted/.........................................
//    public EmployeeDTO editEmployeeById(Map<String,Object> updates, Integer empID) {
//        if(!exists(empID)) return null;
//        EmployeeEntity employeeEntity = employeeRepository.findById(empID).get();
//        updates.forEach((field,value)->{
//            Field fieldToBeUpdated = ReflectionUtils.findField(EmployeeEntity.class, String.valueOf(field));
//            if (fieldToBeUpdated != null) {
//                fieldToBeUpdated.setAccessible(true);
//                ReflectionUtils.setField(fieldToBeUpdated, employeeEntity, value);
//            }
//        });
//        return modelMapper.map(saved,EmployeeDTO.class);
//    }
// .............................................to be implemneted/.........................................
}
