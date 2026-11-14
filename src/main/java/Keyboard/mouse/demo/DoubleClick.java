package Keyboard.mouse.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/mouse-actions");
		
		WebElement ele = driver.findElement(By.id("double-click-me-button"));
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}
}
