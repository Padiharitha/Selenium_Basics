
package JavaScriptExe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Scroll
{
	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/scroll");
		
		WebElement ele = driver.findElement(By.xpath("//button[text()=\"Button 2\"]"));
		
		WebElement ele1 = driver.findElement(By.xpath("//button[text()=\"Button 3\"]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		
		Thread.sleep(Duration.ofSeconds(5));
		
		js.executeScript("arguments[0].scrollIntoView(true);", ele1);
		
		
	}
}
