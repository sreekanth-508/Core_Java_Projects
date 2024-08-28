package com.singtel.oops;

public class EncapsulationDemo {
	
	private int eid;
	private String firstName;
	private String lastName;
	private String role;
	private String email;
	private String gender;
	private long mobileNo;
	private double salary;
	
	public void setEid(int id) {
		this.eid=id;
	}
	public int getEid() {
		return eid;
	}
	public void setFirstName(String fn) {
		this.firstName=fn;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String ln) {
		this.lastName=ln;
	}
	public String getLastName() {
		return lastName;
	}
	public void setRole(String role) {
		this.role=role;
	}
	public String getRole() {
		return role;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getEmail() {
		return email;
	}
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return gender;
	}
	public void setMobileNo(long mn) {
		this.mobileNo=mn;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setSalary(double sal) {
		this.salary=sal;
	}
	public double getSalary() {
		return salary;
	}
		
}
