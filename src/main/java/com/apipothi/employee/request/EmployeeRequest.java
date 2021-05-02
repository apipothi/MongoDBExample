package com.apipothi.employee.request;

public class EmployeeRequest {

	int employeeid;
	String employeename;
	int employeesalery;
	String employeeemail;

	public EmployeeRequest() {
	}

	public EmployeeRequest(int employeeid, String employeename, int employeesalery, String employeeemail) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeesalery = employeesalery;
		this.employeeemail = employeeemail;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public int getEmployeesalery() {
		return employeesalery;
	}

	public void setEmployeesalery(int employeesalery) {
		this.employeesalery = employeesalery;
	}

	public String getEmployeeemail() {
		return employeeemail;
	}

	public void setEmployeeemail(String employeeemail) {
		this.employeeemail = employeeemail;
	}

	@Override
	public String toString() {
		return "EmployeeRequest [employeeid=" + employeeid + ", employeename=" + employeename + ", employeesalery="
				+ employeesalery + ", employeeemail=" + employeeemail + "]";
	}

}
