package Common_methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MulWindows_Demo 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/multiple-windows");
		
		String currentwindowTabId = driver.getWindowHandle();
		System.out.println("Current window Id is:" + currentwindowTabId);
		
		WebElement ele = driver.findElement(By.xpath("//button[text()=\"Click Here\"]"));
		ele.click();
		
		Set <String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles);
		
		for(String s : allWindowHandles)
		{
			if(!s.equalsIgnoreCase(currentwindowTabId))
			{
				driver.switchTo().window(s);
				break;
			}
		}
		
		WebElement ele1 = driver.findElement(By.id("close-window-button"));
		ele1.click();
	}
}

