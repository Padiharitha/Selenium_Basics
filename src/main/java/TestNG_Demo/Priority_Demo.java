package TestNG_Demo;

import org.testng.annotations.Test;

public class Priority_Demo 
{
	//a --> b --> c --> d (Default)
	//b --> a --> d --> c (User-defined).
	@Test(priority = 2)
	public void a()
	{
		System.out.println("This is a testcase a");
	}
	@Test(priority = 1)
	public void b()
	{
		System.out.println("This is a testcase b");
	}
	@Test(priority = 4)
	public void c()
	{
		System.out.println("This is a testcase c");
	}
	@Test(priority = 3)
	public void d()
	{
		System.out.println("This is a testcase d");
	}
}
