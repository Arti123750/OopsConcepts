package com.oops.concepts;

abstract class MyClass
{
abstract void m1();
void m2()
{
System.out.println("Concrete method");
}
}

class MyImplemetedClass extends MyClass
{
	public void m1() {
		System.out.println("Implemeted Abstract method");
}
	}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyImplemetedClass m1=new MyImplemetedClass();
		m1.m1();
		m1.m2();
	}

}
