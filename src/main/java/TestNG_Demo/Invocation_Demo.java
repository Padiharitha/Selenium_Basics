package TestNG_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invocation_Demo 
{
	WebDriver driver;
	@Test(priority=1, invocationCount = 2)
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
        
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(5000);
    }
}
