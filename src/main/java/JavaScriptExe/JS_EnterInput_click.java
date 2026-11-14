package JavaScriptExe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_EnterInput_click {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/javascript-executor");
		
		WebElement ele = driver.findElement(By.id("js-executor-text-input"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Haritha';", ele);
		
		WebElement ele1 = driver.findElement(By.id("js-executor-click-button"));
		
		js.executeScript("arguments[0].click();", ele1);
		
		//driver.quit();	
	}

}
