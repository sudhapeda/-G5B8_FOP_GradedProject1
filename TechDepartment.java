package com.greatlearning.department.model;

public class TechDepartment extends SuperDepartment{

	private String departmentName;
	private String getTodaysWork;
	private String getWorkDeadline;
	private String getTechStackInformation;
	
	public String getDepartmentName() {
		return "Tech Department" ;
	}
	
	public String getGetTodaysWork() {
		return "Complete coding of module 1";
	}
	
	public String getGetWorkDeadline() {
		return "Complete by EOD";
	}	
	
	public String getGetTechStackInformation() {
		return "core Java";
	}
}
