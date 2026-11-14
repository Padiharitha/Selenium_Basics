package Keyboard.mouse.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_shortcuts 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/sign-up");
		
		WebElement firstName = driver.findElement(By.xpath("//input[@aria-label=\"First Name\"]"));
		firstName.sendKeys("Haritha");
		//firstName.click();
		
		WebElement LastName = driver.findElement(By.xpath("//input[contains(@id,'last-name')]"));
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.click(firstName).keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform();
		
		act.click().keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).perform();
		
		act.click(LastName).keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).perform();
			
	}
}
