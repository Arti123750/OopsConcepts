package com.oops.concepts;

public class FuctionalityInterface {
	
	public static void isMarker(Object object)
	{
		if(object instanceof MyMarkupInterface)
		{
			for (int i = 0; i < 5; i++) {
				
				System.out.println("This is my marker interface");
				
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementMarkupInterface m1=new ImplementMarkupInterface();
		isMarker(m1);
		Arti a1=new Arti();
		isMarker(a1);
		a1.m2();

	}

}
class Arti implements MyMarkupInterface
{
void m2()
{
System.out.println("Marker Interface implemented");	
}

}
