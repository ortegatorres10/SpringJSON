package com.ortegatorres.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ortegatorres.model.Employee;

@Controller
@RestController
public class EmployeeController {

	@RequestMapping(value="/employees", method = RequestMethod.GET)
	public List<Employee> getAll(){
		return getEmployeeList();
	}
	
	private List<Employee> getEmployeeList(){
		List<Employee> employeeList = new ArrayList<Employee>();
		Employee empOne = new Employee(1,"Lokesh","Gupta","howtodoinjava@gmail.com");
        Employee empTwo = new Employee(2,"Amit","Singhal","asinghal@yahoo.com");
        Employee empThree = new Employee(3,"Kirti","Mishra","kmishra@gmail.com");
        Employee empFour = new Employee(4,"Ortega","Torres","ortegatorres10@gmail.com");
        
        employeeList.add(empOne);
        employeeList.add(empTwo);
        employeeList.add(empThree);
        employeeList.add(empFour);
        
        return employeeList;
	}
}
