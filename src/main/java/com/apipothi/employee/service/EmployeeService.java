package com.apipothi.employee.service;

import java.util.List;

import com.apipothi.employee.request.EmployeeRequest;
import com.apipothi.employee.to.EmployeeDetailsTO;

public interface EmployeeService {

	public String createEmployee(EmployeeRequest request);

	public  List<EmployeeDetailsTO> getEmployee();

	public List<EmployeeDetailsTO> getbyIdEmployee(int id);

	public String updateEmployee(EmployeeRequest request);

	public String deleteEmployee(int id);

}
