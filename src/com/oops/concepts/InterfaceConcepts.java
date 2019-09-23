package com.oops.concepts;

public class InterfaceConcepts implements  I1,I2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceConcepts i1=new InterfaceConcepts();
		i1.Cat();
		i1.cow();
		i1.Dod();
		i1.hen();
		i1.sparrow();
		i1.corw();
	}
	@Override
	public void corw() {
		System.out.println("Crow method calling");
		
	}

	@Override
	public void hen() {
		System.out.println("Hen Method");
		
	}

	@Override
	public void sparrow() {
		System.out.println("Sparrow method");
	}

	@Override
	public void Dod() {
		System.out.println("Dog Method");
		
	}

	@Override
	public void Cat() {
		System.out.println("Cat Method");
		
	}

	@Override
	public void cow() {
		System.out.println("Cow Method");
	}

}


