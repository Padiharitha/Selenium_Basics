package Common_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_iframe 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/nested-iframe");
		
		driver.switchTo().frame("parent-frame"); // Switch to parent frame.
		
		WebElement userName = driver.findElement(By.id("parent-username"));
		userName.sendKeys("Prem Kumar");
		
		Thread.sleep(5000);
		driver.switchTo().frame("child-frame"); //Switch to child frame.
		
		WebElement Email = driver.findElement(By.id("child-email"));
		Email.sendKeys("premkumar1@gmail.com");
		
		Thread.sleep(5000);
		driver.switchTo().parentFrame();
		userName.clear();
		
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);
		String Title = driver.getTitle();
		System.out.println(Title);
		
		driver.quit();
		
	}
}
