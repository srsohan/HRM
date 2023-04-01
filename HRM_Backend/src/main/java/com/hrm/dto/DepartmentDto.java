package com.hrm.dto;


import lombok.Data;

@Data
public class DepartmentDto {
    private long id;
    private String deptName;
    private EmployeeDto employee;
}

