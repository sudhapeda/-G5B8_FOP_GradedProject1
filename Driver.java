package com.greatlearning.department.driver;

import com.greatlearning.department.model.AdminDepartment;
import com.greatlearning.department.model.HrDepartment;
import com.greatlearning.department.model.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		
		SuperDepartment Admin = new AdminDepartment();
		SuperDepartment Hr = new HrDepartment();
		SuperDepartment Tech = new TechDepartment();
		
		System.out.println(Admin.getDepartmentName());
		System.out.println(Admin.getGetTodaysWork());
		System.out.println(Admin.getGetWorkDeadline());
		System.out.println(Admin.getIsTodaysHoliday());
		
		System.out.println();
		
		System.out.println(Hr.getDepartmentName());
		System.out.println(Hr.getGetTodaysWork());
		System.out.println(Hr.getGetWorkDeadline());
		if(Hr instanceof SuperDepartment) {
			System.out.println(((HrDepartment)Hr).getDoActivity());
		}
		System.out.println(Hr.getIsTodaysHoliday());
		
		System.out.println();
		
		System.out.println(Tech.getDepartmentName());
		System.out.println(Tech.getGetTodaysWork());
		System.out.println(Tech.getGetWorkDeadline());
		if(Tech instanceof SuperDepartment) {
			System.out.println(((TechDepartment)Tech).getGetTechStackInformation());
		}
		System.out.println(Tech.getIsTodaysHoliday());
		
		

	}

}
