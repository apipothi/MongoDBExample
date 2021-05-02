package com.apipothi.employee.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apipothi.employee.request.EmployeeRequest;
import com.apipothi.employee.response.EmployeeResponse;
import com.apipothi.employee.service.impl.EmployeeServiceimpl;
import com.apipothi.employee.to.EmployeeDetailsTO;

@RestController
public class EmployeeController {

	private final static Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeServiceimpl service;

	@PostMapping("/createemployeedata")
	public EmployeeResponse createEmployeeData(@RequestBody EmployeeRequest request) {

		logger.info("START-createEmployeeData() request{} " + request);
		// TODO we need to check the null for each field
		EmployeeResponse response = new EmployeeResponse();

		String responseMsg = "";

		if (request != null) {

			try {

				responseMsg = service.createEmployee(request);
				response.setMsg(responseMsg);
				response.setSucess(true);

			} catch (Exception e) {
				response.setMsg(responseMsg);
				response.setSucess(false);
			}

		} else {
			logger.error("Request Can not be null ");
		}

		logger.info("START-createEmployeeData() CONTROLLER -RESPONSE{} " + response);
		return response;

	}

	@GetMapping("/getemployeedata")
	public EmployeeResponse getEmployeeData() {

		logger.info("START-getEmployeeData() ");
		// TODO we need to check the null for each field
		EmployeeResponse response = new EmployeeResponse();

		try {

			List<EmployeeDetailsTO> allempdata = service.getEmployee();
			response.setMsg("List of Employee data");
			response.setSucess(true);
			response.setTo(allempdata);

		} catch (Exception e) {

			response.setMsg("Exception occured during getting the data");
			response.setSucess(false);
		}

		logger.info("START-getEmployeeData() CONTROLLER RESPONSE{}" + response);
		return response;

	}

	@GetMapping("/getemployeedatabyid/{id}")
	public EmployeeResponse getbyIdEmployeeData(@PathVariable int id) {

		EmployeeResponse response = new EmployeeResponse();

		if (id != 0) {

			logger.info("START-getbyIdEmployeeData() request{} " + id);

			try {

				List<EmployeeDetailsTO> databyid = service.getbyIdEmployee(id);

				response.setMsg("Data by given id");
				response.setSucess(true);
				response.setTo(databyid);

			} catch (Exception e) {
				response.setMsg("Exception occured during Data by given id");
				response.setSucess(false);

			}

		} else {

			response.setMsg("ID should not be null ");
			response.setSucess(false);

		}

		logger.info("END-getEmployeeData() CONTROLLER RESPONSE{}" + response);
		return response;

	}

	@PutMapping("/updateemployeedata/{id}")
	public EmployeeResponse updateEmployeeData(@PathVariable int id, @RequestBody EmployeeRequest request) {

		// TODO we need to check the null for each field

		EmployeeResponse response = new EmployeeResponse();
		String updatemsg = "";

		if (id != 0 && request != null) {
			logger.info("START-updateEmployeeData()  id{} , request{} " + id + request);

			try {

				request.setEmployeeid(id);
				updatemsg = service.updateEmployee(request);

				response.setMsg(updatemsg);
				response.setSucess(true);

			} catch (Exception e) {

				response.setMsg(updatemsg);
				response.setSucess(false);

			}

		} else {

			response.setMsg("ID or/And request can not be null");
			response.setSucess(false);
		}

		logger.info("END-updateEmployeeData() CONTROLLER RESPONSE{}" + response);
		return response;

	}

	@DeleteMapping("/deleteemployeedata/{id}")
	public EmployeeResponse deleteEmployeeData(@PathVariable int id) {

		String statusmsg = "";
		EmployeeResponse response = new EmployeeResponse();

		if (id != 0) {

			logger.info("START-updateEmployeeData()  id{} " + id);

			try {

				statusmsg = service.deleteEmployee(id);
				response.setMsg(statusmsg);
				response.setSucess(true);

			} catch (Exception e) {
				response.setMsg(statusmsg);
				response.setSucess(false);
			}

		} else {

			response.setMsg("ID can not be null");
			response.setSucess(false);
		}
		return response;

	}

}
