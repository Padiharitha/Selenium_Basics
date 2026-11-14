package TestNG_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Demo 
{
	WebDriver driver;
	@Parameters({"UserName" , "Password"})
	@Test
 public void Login(String UserName , String Password) throws InterruptedException
 {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     
     Thread.sleep(5000);
 
     WebElement userNameElement = driver.findElement(By.xpath("//input[@name=\"username\"]"));
     userNameElement.sendKeys(UserName);

     WebElement passwordElement =  driver.findElement(By.xpath("//input[@name=\"password\"]"));
     passwordElement.sendKeys(Password);
     
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
     Thread.sleep(5000);
 }
}
