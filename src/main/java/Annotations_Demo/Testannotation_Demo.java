package Annotations_Demo;

import org.testng.annotations.Test;

@Test //======> Class level annotation

public class Testannotation_Demo 
{

 public void login()
 {
	 System.out.println("Login to Application");
 }
 
 public void logout()
 {
	 System.out.println("Logout from Application");
 }
}
