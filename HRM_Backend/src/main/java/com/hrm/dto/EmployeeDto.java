
package com.hrm.dto;

import lombok.Data;

@Data
public class EmployeeDto {
    private Long id;
    private String employeeName;
    private String department;
    private String designation;
    private String mobile;
    private String email;
    private String joiningDate;
    private String gender;
    private String dob;
    private String address;
}

