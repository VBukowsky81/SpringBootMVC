package com.myprojects.spring.springbootmvcbasic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.myprojects.spring.springbootmvcbasic.model.EmployeeEntity;

@Repository
public interface EmployeeRepository 
			extends CrudRepository<EmployeeEntity, Long> {

}
