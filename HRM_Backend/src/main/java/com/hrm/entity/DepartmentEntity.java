package com.hrm.entity;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "department")
public class DepartmentEntity {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	private String deptName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="departmentHead")
	private  EmployeeEntity employeeEntity;

	public DepartmentEntity(String deptName, EmployeeEntity employeeEntity) {
		this.deptName = deptName;
		this.employeeEntity = employeeEntity;
	}
}
	 
	

