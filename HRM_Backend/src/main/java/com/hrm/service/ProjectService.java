package com.hrm.service;

import com.hrm.dto.ProjectDto;
import com.hrm.entity.ProjectEntity;
import com.hrm.repository.ProjectRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public ProjectDto save(ProjectDto projectDto) {
        ProjectEntity projectEntity = new ProjectEntity();
        projectEntity.setProjectTitle(projectDto.getProjectTitle());
        // map clientDto to clientEntity
        projectEntity.setStartDate(projectDto.getStartDate());
        projectEntity.setDeadline(projectDto.getDeadline());
        // map teamLeaderDto to teamLeaderEntity
        projectEntity.setStatus(projectDto.getStatus());
        projectRepository.save(projectEntity);

        projectDto.setId(projectEntity.getId());
        return projectDto;
    }

    public ProjectDto update(Long id, ProjectDto projectDto) {
        ProjectEntity projectEntity = projectRepository.findById(id).orElse(null);
        if (projectEntity == null) {
            return null;
        }}
