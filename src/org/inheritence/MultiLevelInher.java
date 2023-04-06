package org.inheritence;
//combination  of one child class and more than one parent class
public class MultiLevelInher extends ChildSingleInher {
	public void employeeCar() {
		System.out.println("Mastung");
		}
	public void employeePhone() {
		System.out.println("Iphone");
        }
	public static void main(String[] args) {
		MultiLevelInher m = new MultiLevelInher();
		m.bankEmployeeId();
		m.bankEmployeeSal();
		m.bankEmployeName();
		m.employeePhone();
		m.employeePhoneNo();
		m.emloyeeAge();
		m.employeeCar();
		
	}

}
