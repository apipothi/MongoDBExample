package com.apipothi.employee.service.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.apipothi.employee.model.EmployeeDetails;

@Repository
public interface EmployeeDAO extends MongoRepository<EmployeeDetails, Integer> {

}
