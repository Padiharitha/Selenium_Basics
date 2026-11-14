package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relative_Locators 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shelendrakumaracademy.com/web/relative-locators");
	
	//above
	WebElement ref = driver.findElement(By.id("login-button"));
	
	WebElement ele = driver.findElement(RelativeLocator.with(By.tagName("input")).above(ref));
	ele.sendKeys("Prem Kumar");
	
	//below
	WebElement ref1 = driver.findElement(By.id("search-button"));
	
	WebElement ele1 = driver.findElement(RelativeLocator.with(By.tagName("input")).below(ref1));
	ele1.sendKeys("Helloworld");
	
	//In the same way "toLeftto()" and "toRightto()" methods work.
}
}
