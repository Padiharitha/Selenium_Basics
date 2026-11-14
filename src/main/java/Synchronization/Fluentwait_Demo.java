package Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait_Demo 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/synchronization");
		
		WebElement ele = driver.findElement(By.id("track-payment-status-button"));
		ele.click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchElementException.class);
		
		WebElement ele1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fluent-wait-result")));
		System.out.println(ele1.getText());
	}
}
