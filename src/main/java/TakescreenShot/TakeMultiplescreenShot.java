package TakescreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TakeMultiplescreenShot 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		 WebDriver driver = new ChromeDriver();

	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        
	        Thread.sleep(5000);
	        
	        capturescreenshot(driver, "LoginPage");
	        
	        Thread.sleep(5000);
	        WebElement UserName = driver.findElement(By.xpath("//input[@name=\"username\"]"));
	        
	        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        //wait.until(ExpectedConditions.visibilityOf(UserName));
	        
	        UserName.sendKeys("Prem Kumar");
	        
	        capturescreenshot(driver, "UserName");
	       
	        WebElement Password =  driver.findElement(By.xpath("//input[@name=\"password\"]"));
	        //wait.until(ExpectedConditions.visibilityOf(Password));
	        
	        Password.sendKeys("Padi");
	        
	        capturescreenshot(driver, "Password");
	        
	        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	        
	        Thread.sleep(5000);
	        
	        capturescreenshot(driver, "Loginbutton");
	    
	}
	
	public static void capturescreenshot(WebDriver driver , String FileName) throws IOException 
	{
		TakesScreenshot sc = (TakesScreenshot) driver;
		File image = sc.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("D:\\Projects\\Selenium_Basics\\Screenshots\\" + FileName +".png");
		
		
			FileUtils.copyFile(image, destination);
	}
}

//Launch the browser.
//Open the Login Page.
//Enter username.
//Take Screenshot.
//Enter password.
//Take Screenshot.
//Click on Loginbutton.
//Take Screenshot.