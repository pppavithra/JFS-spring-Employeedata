package com.guvi.SpringEmployeeDetailsApplication.repository;

import com.guvi.SpringEmployeeDetailsApplication.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Employeerepository extends MongoRepository<Employee, String> {


}
