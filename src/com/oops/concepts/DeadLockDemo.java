package com.oops.concepts;

public class DeadLockDemo {

	public void m1()
	{
		synchronized(String.class)
		{
			
			System.out.println("Aquire lock on String class");
		synchronized (Integer.class)
		{
			System.out.println("Aquire lock on Intger class");
		}
		}
		}
	public void m2()
	{
		synchronized (String.class) {
			System.out.println("Aquire lock on String class");
			
			
		synchronized(Integer.class)
		{
			System.out.println("Aquire lock on Integer class");
		}
			
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLockDemo d1=new DeadLockDemo();
		d1.m1();
		d1.m2();

	}

}
