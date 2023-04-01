package com.hrm.controller;

import com.hrm.dto.ProjectDto;
import com.hrm.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectController {

	private final ProjectService projectService;

	public ProjectController(ProjectService projectService) {
		this.projectService = projectService;
	}

	@GetMapping
	public ResponseEntity<List<ProjectDto>> findAllProjects() {
		List<ProjectDto> projects = projectService.findAllProjects();
		return new ResponseEntity<>(projects, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ProjectDto> findProjectById(@PathVariable Long id) {
		ProjectDto project = projectService.findProjectById(id);
		return new ResponseEntity<>(project, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<ProjectDto> createProject(@RequestBody ProjectDto projectDto) {
		ProjectDto createdProject = projectService.createProject(projectDto);
		return new ResponseEntity<>(createdProject, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ProjectDto> updateProject(@PathVariable Long id, @RequestBody ProjectDto projectDto) {
		ProjectDto updatedProject = projectService.updateProject(id, projectDto);
		return new ResponseEntity<>(updatedProject, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
		projectService.deleteProject(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}
