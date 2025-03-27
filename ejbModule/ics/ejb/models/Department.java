package ics.ejb.models;

import jakarta.ejb.LocalBean;
import jakarta.ejb.Stateful;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import ics.ejb.interfaces.*;

@Stateful
@LocalBean
public class Department implements DepartmentLocal {
	private static Random rand = new Random();
	private String deptName;
	private int deptNo;
	private long deptBudget = 0;
	private ArrayList<EmployeeLocal> employees = new ArrayList<EmployeeLocal>();

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public long getDeptBudget() {
		return deptBudget;
	}
	
	
	public void setDeptRandomBudget() {
		this.deptBudget = rand.nextLong(100000, 500000);
	}

	public ArrayList<EmployeeLocal> getEmployees() {

		return employees;
	}

	public void getEmployeeNames(HttpServletResponse response) {

		try {

			ArrayList<EmployeeLocal> localEmployees = this.getEmployees();
			PrintWriter out = response.getWriter();
			if (localEmployees != null) {
				for (EmployeeLocal emp : localEmployees) {
					out.println(emp.getName());
				}
			}

			else {
				out.println("No list");
			}
		} catch (IOException ex) {
			System.out.println("Error");
		}

	}

	public void add(EmployeeLocal e) {
		employees.add(e);
	}

	public void remove(EmployeeLocal e) {
		employees.remove(e);
	}
}
