package com.apipothi.employee.to;

import org.springframework.data.annotation.Id;

public class EmployeeDetailsTO {

	int employeeid;
	String employeename;
	int employeesalery;
	String employeeemail;

	public EmployeeDetailsTO() {
	}

	public EmployeeDetailsTO(int employeeid, String employeename, int employeesalery, String employeeemail) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.employeesalery = employeesalery;
		this.employeeemail = employeeemail;
	}

	/**
	 * @return the employeeid
	 */
	public int getEmployeeid() {
		return employeeid;
	}

	/**
	 * @param employeeid the employeeid to set
	 */
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	/**
	 * @return the employeename
	 */
	public String getEmployeename() {
		return employeename;
	}

	/**
	 * @param employeename the employeename to set
	 */
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	/**
	 * @return the employeesalery
	 */
	public int getEmployeesalery() {
		return employeesalery;
	}

	/**
	 * @param employeesalery the employeesalery to set
	 */
	public void setEmployeesalery(int employeesalery) {
		this.employeesalery = employeesalery;
	}

	/**
	 * @return the employeeemail
	 */
	public String getEmployeeemail() {
		return employeeemail;
	}

	/**
	 * @param employeeemail the employeeemail to set
	 */
	public void setEmployeeemail(String employeeemail) {
		this.employeeemail = employeeemail;
	}

	@Override
	public String toString() {
		return "EmployeeDetailsTO [employeeid=" + employeeid + ", employeename=" + employeename + ", employeesalery="
				+ employeesalery + ", employeeemail=" + employeeemail + "]";
	}

}
