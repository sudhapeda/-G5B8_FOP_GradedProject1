package com.greatlearning.department.model;

public class SuperDepartment {
	
	private String departmentName;
	private String getTodaysWork;
	private String getWorkDeadline;
	private String isTodaysHoliday;
	
	public String getDepartmentName() {
		return "Super Department" ;
	}
	
	public String getGetTodaysWork() {
		return "No Work as of Now";
	}
	
	public String getGetWorkDeadline() {
		return "Nil";
	}	
	
	public String getIsTodaysHoliday() {
		return "Today is not a holiday";	
	}
}
