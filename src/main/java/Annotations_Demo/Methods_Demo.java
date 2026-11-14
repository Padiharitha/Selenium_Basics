package Annotations_Demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Methods_Demo
{
@BeforeMethod
public void Login()
{
	System.out.println("Login successful");
}
@AfterMethod
public void Logout()
{
	System.out.println("Logout successful");
}
@Test
public void Addtocart()
{
	System.out.println("Add to cart successful");
}
@Test
public void removecart()
{
	System.out.println("Remove cart successful");
}
}
