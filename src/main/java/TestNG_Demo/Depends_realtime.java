package TestNG_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Depends_realtime 
{
	 public static WebDriver driver;
	 @Test()
	 public void login() throws InterruptedException
	    {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        
	        Thread.sleep(5000);
	    
	        WebElement UserName = driver.findElement(By.xpath("//input[@name=\"username\"]"));
	        UserName.sendKeys("Admin");

	        WebElement Password =  driver.findElement(By.xpath("//input[@name=\"password\"]"));
	        Password.sendKeys("admin123");
	        
	        driver.findElement(By.xpath("//button[@type=\"submi\"]")).click();
	        Thread.sleep(5000);
	    }
	    @Test(dependsOnMethods = "login")
		public void logout()
		{
			driver.findElement(By.xpath("//img[@alt=\"profile picture\"]")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();
		}
	 
}
