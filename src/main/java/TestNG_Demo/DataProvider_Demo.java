package TestNG_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Demo
{
	WebDriver driver;
	@Test(dataProvider = "getTestData")
 public void Login(String userName, String Password) throws InterruptedException
 {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     
     Thread.sleep(5000);
 
     WebElement UserNameele = driver.findElement(By.xpath("//input[@name=\"username\"]"));
     UserNameele.sendKeys(userName);

     WebElement Passwordele =  driver.findElement(By.xpath("//input[@name=\"password\"]"));
     Passwordele.sendKeys(Password);
     
     driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
     Thread.sleep(5000);
 }
 @DataProvider
 public Object [] [] getTestData()
 {
	 Object [] [] data = new Object[2][2];
	 data [0][0] = "Admin";
	 data [0][1] = "admin123";
	 data [1][0] = "SuperAdmin";
	 data [1][1] = "admin12";
	 return data;
	 
 }
}
