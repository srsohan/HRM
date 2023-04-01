package com.hrm.entity;

import com.sun.org.apache.bcel.internal.generic.NEW;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "project  ")
public class ProjectEntity {
     @Id
     @GeneratedValue ( strategy = GenerationType.AUTO )
    private Long id;
    private String projectTitle;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "clientName")
    private ClientEntity clientEntity;
    private String startDate;
    private String deadline;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teamLeader")
    private EmployeeEntity employeeEntity;
    private String status ;

    public ProjectEntity(String projectTitle, String clientName, String startDate, String deadline, EmployeeEntity employeeEntity, List<EmployeeEntity> team, String status) {
        this.projectTitle = projectTitle;
        this.clientEntity = clientEntity;
        this.startDate = startDate;
        this.deadline = deadline;
        this.employeeEntity = employeeEntity;
        this.status = status;



    }
}
