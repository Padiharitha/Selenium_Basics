package TestNG_Demo;

import org.testng.annotations.Test;

public class Group_Signup 
{
	@Test(groups = "Sanity")
	public void createAccount()
	{
		System.out.println("Account created successfully");
	}
}
