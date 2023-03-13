package com.greatlearning.department.driver;

import com.greatlearning.department.model.AdminDepartment;
import com.greatlearning.department.model.HrDepartment;
import com.greatlearning.department.model.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		
		AdminDepartment Admin = new AdminDepartment();
		HrDepartment Hr = new HrDepartment();
		TechDepartment Tech = new TechDepartment();
		
		System.out.println(Admin.getDepartmentName());
		System.out.println(Admin.getGetTodaysWork());
		System.out.println(Admin.getGetWorkDeadline());
		System.out.println(Admin.getIsTodaysHoliday());
		
		System.out.println();
		
		System.out.println(Hr.getDepartmentName());
		System.out.println(Hr.getGetTodaysWork());
		System.out.println(Hr.getGetWorkDeadline());
		System.out.println(Hr.getDoActivity());
		System.out.println(Hr.getIsTodaysHoliday());
		
		System.out.println();
		
		System.out.println(Tech.getDepartmentName());
		System.out.println(Tech.getGetTodaysWork());
		System.out.println(Tech.getGetWorkDeadline());
		System.out.println(Tech.getGetTechStackInformation());
		System.out.println(Tech.getIsTodaysHoliday());
		
		

	}

}
