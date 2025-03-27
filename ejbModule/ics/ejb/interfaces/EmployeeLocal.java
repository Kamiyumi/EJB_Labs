package ics.ejb.interfaces;
import jakarta.ejb.Local;


@Local
public interface EmployeeLocal {
	public String getName();
	public void setName(String name);
	public String getAddress();
	public void setAddress(String address);
	public DepartmentLocal getDepartment();
	public void setDepartment(DepartmentLocal dept);
}
