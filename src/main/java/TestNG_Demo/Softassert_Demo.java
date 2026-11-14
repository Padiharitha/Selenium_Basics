package TestNG_Demo;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert_Demo
{
@Test
public void AssertFalse() throws InterruptedException
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
    //Click on Leave Button.
    
    WebElement leaveBtn = driver.findElement(By.xpath("//span[text()=\"Leave\"]"));
    leaveBtn.click();
    
   WebElement ele =  driver.findElement(By.xpath("//span[contains(normalize-space(.),'Records Found')]"));
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView" , ele);
    
    SoftAssert sc = new SoftAssert();
    
    
    boolean checkbox = driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-check oxd-checkbox-input-icon\"]")).isSelected();
    sc.assertFalse(checkbox);
    
    boolean search = driver.findElement(By.xpath("//button[text()=\" Search \"]")).isEnabled();
    sc.assertTrue(search);
    
    driver.findElement(By.xpath("//input[@placeholder=\"Type for hints...\"]")).sendKeys("Haritha");
    
    sc.assertAll();
    
}
}
