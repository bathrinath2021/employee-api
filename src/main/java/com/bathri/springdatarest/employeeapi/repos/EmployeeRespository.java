package com.bathri.springdatarest.employeeapi.repos;

import org.springframework.data.repository.CrudRepository;

import com.bathri.springdatarest.employeeapi.entities.Employee;

public interface EmployeeRespository extends CrudRepository<Employee, Long> {

}
