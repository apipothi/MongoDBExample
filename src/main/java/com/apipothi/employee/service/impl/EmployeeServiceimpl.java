package com.apipothi.employee.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apipothi.employee.model.EmployeeDetails;
import com.apipothi.employee.request.EmployeeRequest;
import com.apipothi.employee.service.EmployeeService;
import com.apipothi.employee.service.dao.EmployeeDAO;
import com.apipothi.employee.to.EmployeeDetailsTO;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	private final static Logger logger = LoggerFactory.getLogger(EmployeeServiceimpl.class);
	@Autowired
	EmployeeDAO dao;

	@Override
	public String createEmployee(EmployeeRequest request) {

		logger.info("Startr - createEmployee{} Serviced Request{}" + request);
		String statusMsg = "";
		EmployeeDetails emp = new EmployeeDetails();
		try {

			emp.setEmployeeid(request.getEmployeeid());
			emp.setEmployeename(request.getEmployeename());
			emp.setEmployeeemail(request.getEmployeeemail());
			emp.setEmployeesalery(request.getEmployeesalery());

			dao.insert(emp);
			statusMsg = "Data Inserted successfully";

		} catch (Exception e) {
			statusMsg = "Exceptin occured while Inserting the Data ";
			logger.error("Exceptin occured while Inserting the Data");
		}
		logger.info("Startr - createEmployee{} Serviced RESPONSE{}" + statusMsg);
		return statusMsg;
	}

	@Override
	public List<EmployeeDetailsTO> getEmployee() {

		logger.info("Startr - getEmployee{} Serviced ");

		List<EmployeeDetailsTO> listof = new ArrayList<EmployeeDetailsTO>();

		try {
			List<EmployeeDetails> allemployeedetails = dao.findAll();

			for (EmployeeDetails employeeDetails : allemployeedetails) {

				EmployeeDetailsTO to = new EmployeeDetailsTO();
				to.setEmployeeid(employeeDetails.getEmployeeid());
				to.setEmployeename(employeeDetails.getEmployeename());
				to.setEmployeeemail(employeeDetails.getEmployeeemail());
				to.setEmployeesalery(employeeDetails.getEmployeesalery());

				listof.add(to);

			}
		} catch (Exception e) {
			logger.error("Exceptin occured while getting the Data from DB");
		}

		logger.info("Startr - getEmployee{} Service RESPONSE{} " + listof);
		return listof;
	}

	@Override
	public List<EmployeeDetailsTO> getbyIdEmployee(int id) {
		logger.info("Start - getbyIdEmployee{} Serviced ");

		List<EmployeeDetailsTO> listof = new ArrayList<EmployeeDetailsTO>();
		EmployeeDetailsTO to = new EmployeeDetailsTO();

		try {
			Optional<EmployeeDetails> databyid = dao.findById(id);

			to.setEmployeeid(databyid.get().getEmployeeid());
			to.setEmployeename(databyid.get().getEmployeename());
			to.setEmployeeemail(databyid.get().getEmployeeemail());
			to.setEmployeesalery(databyid.get().getEmployeesalery());

			listof.add(to);

		} catch (Exception e) {

			logger.error("Exceptin occured while getting the Data by id  from DB");
		}

		logger.info("End - getbyIdEmployee{} Service RESPONSE " + listof);

		return listof;

	}

	@Override
	public String updateEmployee(EmployeeRequest request) {

		EmployeeDetails emp = new EmployeeDetails();
		String msg = "";

		try {

			emp.setEmployeeid(request.getEmployeeid());
			emp.setEmployeename(request.getEmployeename());
			emp.setEmployeeemail(request.getEmployeeemail());
			emp.setEmployeesalery(request.getEmployeesalery());
			dao.save(emp);

			msg = "Data updated successfully";

		} catch (Exception e) {

			msg = "Exception occured during update";
		}

		return msg;

	}

	@Override
	public String deleteEmployee(int id) {

		String msg = "";

		try {

			dao.deleteById(id);
			msg = "Data got deleted successfully";

		} catch (Exception e) {

			msg = "Exception occured while deleting the data ";
		}

		return msg;

	}

}
