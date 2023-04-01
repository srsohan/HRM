package com.hrm.service;

import com.hrm.dto.EmployeeDto;
import com.hrm.entity.EmployeeEntity;
import com.hrm.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeDto save(EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setEmployeeName(employeeDto.getEmployeeName());
        employeeEntity.setDepartment(employeeDto.getDepartment());
        employeeEntity.setDesignation(employeeDto.getDesignation());
        employeeEntity.setMobile(employeeDto.getMobile());
        employeeEntity.setEmail(employeeDto.getEmail());
        employeeEntity.setJoiningDate(employeeDto.getJoiningDate());
        employeeEntity.setGender(employeeDto.getGender());
        employeeEntity.setDob(employeeDto.getDob());
        employeeEntity.setAddress(employeeDto.getAddress());
        employeeRepository.save(employeeEntity);

        employeeDto.setId(employeeEntity.getId());
        return employeeDto;
    }

    public EmployeeDto update(Long id, EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElse(null);
        if (employeeEntity == null) {
            return null;
        }
        employeeEntity.setEmployeeName(employeeDto.getEmployeeName());
        employeeEntity.setDepartment(employeeDto.getDepartment());
        employeeEntity.setDesignation(employeeDto.getDesignation());
        employeeEntity.setMobile(employeeDto.getMobile());
        employeeEntity.setEmail(employeeDto.getEmail());
        employeeEntity.setJoiningDate(employeeDto.getJoiningDate());
        employeeEntity.setGender(employeeDto.getGender());
        employeeEntity.setDob(employeeDto.setDob());
        employeeEntity.setAddress(employeeDto.getAddress());
        employeeRepository.save(employeeEntity);

        employeeDto.setId(employeeEntity.getId());
        return employeeDto;
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }

    public EmployeeDto findById(Long id) {
        EmployeeEntity employeeEntity = employeeRepository.findById(id).orElse(null);
        if (employeeEntity == null) {
            return null;
        }
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employeeEntity.getId());
        employeeDto.setEmployeeName(employeeEntity.getEmployeeName());
        employeeDto.setDepartment(employeeEntity.getDepartment());
        employeeDto.setDesignation(employeeEntity.getDesignation());
        employeeDto.setMobile(employeeEntity.getMobile());
        employeeDto.setEmail(employeeEntity.getEmail());
        employeeDto.setJoiningDate(employeeEntity.getJoiningDate());
        employeeDto.setGender(employeeEntity.getGender());
        employeeDto.setDob(employeeEntity.getDob());
        employeeDto.setAddress(employeeEntity.getAddress());

        return employeeDto;
    }

    public List<EmployeeDto> findAll() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        List<EmployeeDto> employeeDtos = new ArrayList<>();
        for (EmployeeEntity employeeEntity : employeeEntities) {
            EmployeeDto employeeDto = new EmployeeDto();
            employeeDto.setId(employeeEntity.getId());
            employeeDto.setEmployeeName(employeeEntity.getEmployeeName());
            employeeDto.setDepartment(employeeEntity.getDepartment());
            employeeDto.setDesignation(employeeEntity.getDesignation());
            employeeDto.setMobile(employeeEntity.getMobile());
            employeeDto.setEmail(employeeEntity.getEmail());
            employeeDto.setJoiningDate(employeeEntity.getJoiningDate());
            employeeDto.setGender(employeeEntity.getGender());
            employeeDto.setDob(employeeEntity.getDob());
            employeeDto.setAddress(employeeEntity.getAddress());
            employeeDtos.add(employeeDto);
        }
        return employeeDtos;
    }


