package org.inheritence;

public class ChildSingleInher extends SingleInher {
	public void emloyeeAge() {
		System.out.println("89");

	}
   public void employeePhoneNo() {
	    System.out.println("98765432");

}
   public static void main(String[] args) {
	ChildSingleInher c = new ChildSingleInher();
	c.emloyeeAge();
	c.employeePhoneNo();
	c.bankEmployeeId();
	c.bankEmployeeSal();
	c.bankEmployeName();
}
}
