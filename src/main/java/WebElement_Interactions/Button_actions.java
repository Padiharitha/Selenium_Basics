package WebElement_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_actions 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/button");
		
		WebElement ele = driver.findElement(By.id("click-me-button"));
		
		//Check if element is enabled
		boolean isenabledText = ele.isEnabled();
		System.out.println("is enabled result is:" + isenabledText);
		
		//Get the Text
		String buttonText = ele.getText();
		System.out.println(buttonText);
		
		//Click on the element.
		ele.click();
		
		//driver.quit();
		
	}
}
