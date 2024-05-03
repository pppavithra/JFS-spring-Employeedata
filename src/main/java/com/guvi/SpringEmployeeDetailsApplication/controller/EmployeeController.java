package com.guvi.SpringEmployeeDetailsApplication.controller;

import com.guvi.SpringEmployeeDetailsApplication.entity.Employee;
import com.guvi.SpringEmployeeDetailsApplication.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employees")
public class EmployeeController {
       //inject service layer into controller layer
    @Autowired
    private EmployeeService service;

    //create api endpoint for adding a new employee -> post

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee createEmployee(@RequestBody Employee employee){

        return service.addEmployee(employee);

    }
    //create api endpoint for reteival of all task-> GET
    @GetMapping
    public List<Employee> getEmployees(){
        return service.findAllEmployees();
    }

    //create api endpoint for reteiving of task by id-> GET
    @GetMapping("/{employeeId}")
    public Employee getEmployee(@PathVariable String employeeId){

        return service.getEmployeeByEmployeeId(employeeId);
    }

}
