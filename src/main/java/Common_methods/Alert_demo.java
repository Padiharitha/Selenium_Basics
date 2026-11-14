package Common_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_demo 
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://shelendrakumaracademy.com/web/java-script-alert");
	
	WebElement ele = driver.findElement(By.id("jsConfirm"));
	ele.click();
	
	Thread.sleep(Duration.ofSeconds(3));
	
	//Switch to Alert
	//driver.switchTo().alert().accept();
	
	driver.switchTo().alert().dismiss();
	
}
}
