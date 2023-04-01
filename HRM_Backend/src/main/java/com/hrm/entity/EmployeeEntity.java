package com.hrm.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    private String employeeName;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department")
    private DepartmentEntity departmentEntity;
    private String designation;
    private String mobile;
    private String email;
    private String joiningDate;
    private String gender;
    private String dob;
    private String address;

    public EmployeeEntity(String employeeName, String employeeDept, String designation, String mobile, String email, String joiningDate, String gender, String dob, String address) {
        this.employeeName = employeeName;
        this.departmentEntity= departmentEntity;
        this.designation = designation;
        this.mobile = mobile;
        this.email = email;
        this.joiningDate = joiningDate;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }


}
