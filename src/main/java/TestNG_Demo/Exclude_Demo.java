package TestNG_Demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Exclude_Demo 
{
	@Ignore
	@Test(priority = 2)
	public void a()
	{
		System.out.println("This is a testcase a");
	}
	@Test(priority = 1 , enabled = false)
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
