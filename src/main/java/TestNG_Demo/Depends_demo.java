package TestNG_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends_demo 
{
	@Test
	public void applyLeave()
	{
		Assert.assertEquals(true, true);
		System.out.println("Leave is applied");
	}
	
	@Test(dependsOnMethods = "applyLeave")
	public void approveLeave()
	{
		System.out.println("Leave is approved");
	}
}
