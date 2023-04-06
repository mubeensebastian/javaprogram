package org.javap;
import org.java.*;
public class CarCollection {
	public void fordMustang() {
		System.out.println("my car is Ford Mustang");
}
	public void carYear() {
		System.out.println("manufacturing year is 2023");
}
	public void fuelTank() {
		System.out.println("petrol");

	}
	public void registrationNumber() {
		System.out.println("TN 39 BT 8048");

	}
	public void carPrice() {
		System.out.println("12.075.367");

	}
	public static void main(String[] args) {
		CarCollection c = new CarCollection();
		
		Company cc = new Company();
		Revise r = new Revise();
		r.name();r.age();cc.companyId();cc.companyName();c.fordMustang();c.carYear();c.fuelTank();c.carPrice();
	}

}
