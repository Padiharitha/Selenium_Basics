package TestNG_Demo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertEquals_Demo 
{
	@Test
	public void LogintoOrangeHRM() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        Thread.sleep(5000);
    
        WebElement UserName = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        
        
        UserName.sendKeys("Admin");

        WebElement Password =  driver.findElement(By.xpath("//input[@name=\"password\"]"));
       
        Password.sendKeys("admin123");
        
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(5000);
        
        boolean DashboardEle = driver.findElement(By.xpath("//h6[text()=\"Dashboard\"]")).isDisplayed();
        
        String actualUrl = driver.getCurrentUrl();
        
        //String ExpectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        //String loginUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        //assertEquals(actualUrl , ExpectedUrl);
        //assertNotEquals(actualUrl , loginUrl);
        
        assertTrue(DashboardEle);
        
        

	}
}
