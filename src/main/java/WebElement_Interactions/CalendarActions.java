package WebElement_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarActions {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/calendar");
		
		WebElement departure = driver.findElement(By.id("departure"));
		departure.click();
		
		WebElement forward = driver.findElement(By.xpath("//button[@aria-label=\"Go to the Next Month\"]"));
		forward.click();
		
		WebElement Date = driver.findElement(By.xpath("//button[@aria-label=\"Tuesday, December 1st, 2026\"]"));
		Date.click();
	}
	

}
