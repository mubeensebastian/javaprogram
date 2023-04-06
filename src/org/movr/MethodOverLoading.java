package org.movr;

public class MethodOverLoading {
	//Arguments Depends on Datatype
	public void add(String name ) {
		System.out.println(name);

	}
	public void add(int age) {
		System.out.println(age);

	}
	public void add(char gender) {
	System.out.println(gender);
    }
	public static void main(String[] args) {
		
	
		MethodOverLoading mol =new MethodOverLoading();
		mol.add("mubeen");
		mol.add(28);
		mol.add('m');
		MethodOverLoading m = new MethodOverLoading();
		m.add('f');
		m.add(33);
		m.add("liviya");
		}

}
