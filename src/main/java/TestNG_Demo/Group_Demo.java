package TestNG_Demo;

import org.testng.annotations.Test;

public class Group_Demo 
{
	
@Test(groups = {"Login",  "Sanity"})
 public void Login1()
 {
	 System.out.println("Login1");
 }

@Test(groups = "Login")
public void Login2()
{
	 System.out.println("Login2");
}
@Test(groups = {"Reset", "Sanity"})
public void resetPass1()
{
	 System.out.println("resetPass1");
}
@Test(groups = "Reset")
public void resetPass2()
{
	 System.out.println("resetPass2");
}
	
}
