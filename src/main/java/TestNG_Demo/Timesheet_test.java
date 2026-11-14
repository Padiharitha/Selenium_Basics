package TestNG_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Timesheet_test 
{
	@Test
public void Timesheet()
{
	
	 Priority_realtime.driver.findElement(By.xpath("//a[@href=\"/web/index.php/time/viewTimeModule\"]")).click();
	 
	 Priority_realtime.driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("John Mike Doe");
	 
	 Priority_realtime.driver.findElement(By.xpath("//div[@role=\"option\"]")).click();
	 
}
}
