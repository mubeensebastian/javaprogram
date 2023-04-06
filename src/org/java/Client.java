package org.java;

public class Client extends EmployeeDetails{
	public void clientName() {
		System.out.println("client name is linda velaso");

	}
   public void clientLocation() {
	System.out.println("She is located at italy");

   }
   public static void main(String[] args) {
	Client cl = new Client();
	cl.clientLocation();
	cl.clientName();
	cl.companyId();
	cl.companyName();
	cl.emnpName();
	cl.empId();
	cl.empSalary();
	
}
}
