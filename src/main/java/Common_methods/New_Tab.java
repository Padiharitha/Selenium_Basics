package Common_methods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Tab
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://shelendrakumaracademy.com/web/"); 
		
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(Duration.ofSeconds(3));
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com/");
		
		driver.quit();
		
	}
}
