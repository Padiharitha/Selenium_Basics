package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector1 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/sign-up");
		
		 //Using Contains *Symbol.
		 driver.findElement(By.cssSelector("[class*='signup-first-name']")).sendKeys("Haritha");
		 
		 //Using Starts with ^Symbol.
		 driver.findElement(By.cssSelector("[name^='email']")).sendKeys("harithahari0808@gmail.com");
		 
		 //Using Ends-with $Symbol.
		 driver.findElement(By.cssSelector("[id$='last-name']")).sendKeys("Padi");
		 
	}
}
