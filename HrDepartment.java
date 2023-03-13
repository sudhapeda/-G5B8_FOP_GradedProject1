package com.greatlearning.department.model;

public class HrDepartment extends SuperDepartment{
	
	
	private String departmentName;
	private String getTodaysWork;
	private String getWorkDeadline;
	private String doActivity;
	
	public String getDepartmentName() {
		return "Hr Department" ;
	}
	
	public String getGetTodaysWork() {
		return "Fill today's timesheet and mark your attendance";
	}
	
	public String getGetWorkDeadline() {
		return "Complete by EOD";
	}	

	public String getDoActivity() {
		return "team Lunch";
	}
}
