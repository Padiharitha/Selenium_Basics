package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait_Demo 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/synchronization");
		
		WebElement ele = driver.findElement(By.id("place-order-button"));
		ele.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("explicit-wait-result")));
		System.out.println(ele1.getText());
	}
}
