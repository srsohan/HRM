package com.hrm.dto;

public class ProjectDto {
    private Long id;
    private String projectTitle;
    private ClientDto client;
    private String startDate;
    private String deadline;
    private EmployeeDto teamLeader;
    private String status;

    public ProjectDto() {
    }

    public ProjectDto(String projectTitle, ClientDto client, String startDate, String deadline, EmployeeDto teamLeader, String status) {
        this.projectTitle = projectTitle;
        this.client = client;
        this.startDate = startDate;
        this.deadline = deadline;
        this.teamLeader = teamLeader;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public ClientDto getClient() {
        return client;
    }

    public void setClient(ClientDto client) {
        this.client = client;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public EmployeeDto getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(EmployeeDto teamLeader) {
        this.teamLeader = teamLeader;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
