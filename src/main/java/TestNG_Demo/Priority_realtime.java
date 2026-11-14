package TestNG_Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority_realtime 
{
	public static WebDriver driver;
	@Test(priority=1)
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
	@Test(priority=2)
	public void searchLeave()
	{
		 WebElement leaveBtn = driver.findElement(By.xpath("//span[text()=\"Leave\"]"));
		 leaveBtn.click();
		 boolean search = driver.findElement(By.xpath("//button[text()=\" Search \"]")).isEnabled();
		 Assert.assertTrue(search);
		    
		 driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("Haritha");
		    
	}
	@Test(priority=3)
	public void Logout()
	{
		driver.findElement(By.xpath("//img[@alt=\"profile picture\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();
	}
	@Test(priority=4)
	public void Closebrowser()
	{
		driver.findElement(By.xpath("//h5[text()=\"Login\"]")).isDisplayed();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.quit();
	}
}
