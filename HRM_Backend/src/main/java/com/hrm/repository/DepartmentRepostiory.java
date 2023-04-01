package com.hrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hrm.entity.DepartmentEntity;

@Repository
public interface DepartmentRepostiory extends JpaRepository<DepartmentEntity, Long> {

}
