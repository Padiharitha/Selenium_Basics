package TestNG_Demo;

import org.testng.annotations.Test;

public class PartialPriority 
{
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
	@Test
	public void c()
	{
		System.out.println("This is a testcase c");
	}
	@Test
	public void d()
	{
		System.out.println("This is a testcase d");
	}
}
