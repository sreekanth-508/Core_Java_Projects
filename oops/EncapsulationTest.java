package com.singtel.oops;

public class EncapsulationTest {
	
	public static void main(String[] args) {
		EncapsulationDemo e = new EncapsulationDemo();
		e.setEid(1);
		e.setFirstName("Sreekanth");
		e.setLastName("Chillamakulapalli");
		e.setEmail("sreekanth@gmail.com");
		e.setRole("FullStack Developer");
		e.setGender("Male");
		e.setMobileNo(9989879389l);
		e.setSalary(30000);
		/*
		 * System.out.println("Id : "+e.getEid()+" FirstName : "+e.getFirstName()
		 * +" LastName : "+e.getLastName()
		 * +" Email : "+e.getEmail()+" Role : "+e.getRole()+" Gender : "+e.getGender()
		 * +" Mobile No : "+e.getMobileNo() +" Salary : "+e.getSalary());
		 */
		System.out.println("Id : "+e.getEid());
		System.out.println("FirstName : "+e.getFirstName());
		System.out.println("LastName : "+e.getLastName());
		System.out.println("Email : "+e.getEmail());
		System.out.println("Role : "+e.getRole());
		System.out.println("Gender : "+e.getGender());
		System.out.println("Mobile No : "+e.getMobileNo());
		System.out.println("Salary : "+e.getSalary());
		
	}

}
