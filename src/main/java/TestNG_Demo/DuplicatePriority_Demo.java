package TestNG_Demo;

import org.testng.annotations.Test;

public class DuplicatePriority_Demo 
{
	
		@Test(priority = 2)
		public void a()
		{
			System.out.println("This is a testcase a");
		}
		@Test(priority = 2)
		public void b()
		{
			System.out.println("This is a testcase b");
		}
	
}
