package com.apipothi.employee.response;

import java.util.List;

import com.apipothi.employee.to.EmployeeDetailsTO;

public class EmployeeResponse {

	String msg;
	boolean isSucess;

	List<EmployeeDetailsTO> to;

	public EmployeeResponse() {
	}

	public EmployeeResponse(String msg, boolean isSucess, List<EmployeeDetailsTO> to) {
		super();
		this.msg = msg;
		this.isSucess = isSucess;
		this.to = to;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the isSucess
	 */
	public boolean isSucess() {
		return isSucess;
	}

	/**
	 * @param isSucess the isSucess to set
	 */
	public void setSucess(boolean isSucess) {
		this.isSucess = isSucess;
	}

	/**
	 * @return the to
	 */
	public List<EmployeeDetailsTO> getTo() {
		return to;
	}

	/**
	 * @param to the to to set
	 */
	public void setTo(List<EmployeeDetailsTO> to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "EmployeeResponse [msg=" + msg + ", isSucess=" + isSucess + ", to=" + to + "]";
	}

}
