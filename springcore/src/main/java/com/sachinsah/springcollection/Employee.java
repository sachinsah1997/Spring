package com.sachinsah.springcollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.sachinsah.springcore.Address;
import com.sachinsah.springcore.Student;

public class Employee implements InitializingBean, DisposableBean{

	private int empId;
	private String empName;
	private List<String> empPhone;
	private Set<String> empAddress;
	private Map<String,Boolean> empAssignTask;
	private Address address;
	
	@Autowired
	private Student student;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(List<String> empPhone) {
		this.empPhone = empPhone;
	}
	public Set<String> getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Set<String> empAddress) {
		this.empAddress = empAddress;
	}
	public Map<String, Boolean> getEmpAssignTask() {
		return empAssignTask;
	}
	public void setEmpAssignTask(Map<String, Boolean> empAssignTask) {
		this.empAssignTask = empAssignTask;
	}
	public Employee(int empId, String empName, List<String> empPhone, Set<String> empAddress,
			Map<String, Boolean> empAssignTask) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empPhone = empPhone;
		this.empAddress = empAddress;
		this.empAssignTask = empAssignTask;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empPhone=" + empPhone + ", empAddress="
				+ empAddress + ", empAssignTask=" + empAssignTask + "]";
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing the bean");
		
	}
	public void destroy() throws Exception {
		System.out.println("cleaning up before object destroyed");
		
	}
	
	
}
