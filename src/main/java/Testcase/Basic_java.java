package Testcase;

public class Basic_java {
	
	public Basic_java()
	{
		System.out.println("Object Created");
	}

	public static void main(String[] args) 
	{
		int i=10;
		System.out.println(i);
		
		 // This is constructor which is same as class name.
		 Basic_java b = new Basic_java();
		 b.add(10, 90);
		 System.out.println(b.add(10, 90));
	}
	public int add (int a , int b )
	{
		int c = a+b;
		return c;
	}

}
