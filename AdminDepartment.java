package com.greatlearning.department.model;

public class AdminDepartment extends SuperDepartment{

	private String departmentName;
	private String getTodaysWork;
	private String getWorkDeadline;
	
	public String getDepartmentName() {
		return "Admin Department" ;
	}
	
	public String getGetTodaysWork() {
		return "Complete your documents Submission";
	}
	
	public String getGetWorkDeadline() {
		return "Complete by EOD";
	}	
}
