package com.guvi.SpringEmployeeDetailsApplication.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    @Id

    private String employeeId;
    private String employeeName;

    private String empoloyeeEmail;

    private String Location;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmpoloyeeEmail() {
        return empoloyeeEmail;
    }

    public void setEmpoloyeeEmail(String empoloyeeEmail) {
        this.empoloyeeEmail = empoloyeeEmail;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }


}
