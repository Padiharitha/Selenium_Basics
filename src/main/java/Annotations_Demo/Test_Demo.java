package Annotations_Demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Demo 
{
	@BeforeTest
	public void open()
	{
		System.out.println("Open Browser");
	}
	@AfterTest
	public void close()
	{
		System.out.println("Close browser");
	}
	@Test
	public void login()
	{
		System.out.println("Login completed");
	}
	@Test
	public void search()
	{
		System.out.println("Search completed");
	}
	@Test
	public void logout()
	{
		System.out.println("Logout completed");
	}
}
