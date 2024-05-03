package com.guvi.SpringEmployeeDetailsApplication.service;

import com.guvi.SpringEmployeeDetailsApplication.entity.Employee;
import com.guvi.SpringEmployeeDetailsApplication.repository.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {


    @Autowired
    private Employeerepository repository;

    //define set of service
    //add the data and save employee table
    public Employee addEmployee(Employee employee){

        employee.setEmployeeId(UUID.randomUUID().toString().split("-")[0]);
        return repository.save(employee);
    }

    //List of all employee data should show findAll()
    public List<Employee> findAllEmployees(){
        return repository.findAll();

    }

    //get particular employee  with parameter id in employee data
    public Employee getEmployeeByEmployeeId(String employeeId){
        return repository.findById(employeeId).get();
    }
}
