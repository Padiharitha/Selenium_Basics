package Common_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_demo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/iframe");
		
		WebElement Textbox = driver.findElement(By.id("dialog-text-field"));
		Textbox.sendKeys("Hello World");
		
		driver.switchTo().frame("dialog-embed-frame");
		
		WebElement close = driver.findElement(By.id("dialog-close-button"));
		close.click();
		
		Thread.sleep(5000);
		
	    driver.switchTo().defaultContent();
	    Textbox.clear();	
	    
	    driver.quit();
	}
}
