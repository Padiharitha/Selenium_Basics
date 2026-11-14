package SeleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shelendrakumaracademy.com/web/buttons-with-messages");
	
	 driver.findElement(By.cssSelector("#css-id-save-btn")).click(); // ID - "#"
	 
	 driver.findElement(By.cssSelector(".status-btn")).click(); //classname - "."
	 
	 //Using Attribute - tagname[Attribute = 'Value']
	 driver.findElement(By.cssSelector("button[data-action=\"css-attr-apply\"]")).click();
	 
	//Using Attribute - tagname[Attribute = 'Value'][Attribute1 = 'Value1']
	 driver.findElement(By.cssSelector("button[type=\"button\"][data-tier=\"css-multi-premium\"]")).click();
	 
	 //driver.quit();
	
}	
}
