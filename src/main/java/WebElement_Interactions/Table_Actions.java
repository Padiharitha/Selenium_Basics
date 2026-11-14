package WebElement_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Actions 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/web-table");
		
		WebElement ele = driver.findElement(By.xpath("//td[text()=\"Tom Harris\"]"));
		System.out.println(ele.isDisplayed());
		
		driver.quit();
	}
}
