package ics.ejb.interfaces;
import jakarta.ejb.Local;
import jakarta.servlet.http.HttpServletResponse;

import java.util.ArrayList;


@Local
public interface DepartmentLocal {
	
	public String getDeptName();
	public void setDeptName(String name);
	public int getDeptNo();
	public void setDeptNo(int deptNo);
	public long getDeptBudget();
	public void setDeptRandomBudget();
	public ArrayList<EmployeeLocal> getEmployees();
	public void add(EmployeeLocal e);
	public void remove(EmployeeLocal e);
	public void getEmployeeNames(HttpServletResponse response);
	
		
	
}
