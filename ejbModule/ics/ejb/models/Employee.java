package ics.ejb.models;

import ics.ejb.interfaces.*;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateful;



@Stateful
@LocalBean
public class Employee implements EmployeeLocal {

	private String name;
	private String address;
	private DepartmentLocal department;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
    public Employee() {
        System.out.println("Constructor anropas!");
    }
    
    public DepartmentLocal getDepartment()
    {
    	return department;
    }
    
    public void setDepartment(DepartmentLocal dept)
    {
    	this.department = dept;
    }
    @PostConstruct
    public void init() {
    	System.out.println("PostConstruct init() anropas");
    }
    @PreDestroy
    public void destroy() {
    	System.out.println("PreDestroy destroy anropas");
    }

}
