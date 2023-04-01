package com.hrm.controller;

import com.hrm.dto.EmployeeDto;
import com.hrm.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public EmployeeDto create(@RequestBody EmployeeDto employeeDto) {
        return employeeService.save(employeeDto);
    }

    @PutMapping("/{id}")
    public EmployeeDto update(@PathVariable Long id, @RequestBody EmployeeDto employeeDto) {
        return employeeService.update(id, employeeDto);
    }

    @GetMapping("/{id}")
    public EmployeeDto findOne(@PathVariable Long id) {
        return employeeService.findOne(id);
    }

    @GetMapping
    public List<EmployeeDto> findAll() {
        return employeeService.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        employeeService.delete(id);
    }
}

