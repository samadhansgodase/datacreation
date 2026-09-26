package com.nt.repo;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Employee;

public interface EMployeeRepository extends CrudRepository<Employee, Integer> {

}
