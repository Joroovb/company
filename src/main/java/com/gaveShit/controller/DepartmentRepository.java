package com.gaveShit.controller;

import com.gaveShit.model.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
