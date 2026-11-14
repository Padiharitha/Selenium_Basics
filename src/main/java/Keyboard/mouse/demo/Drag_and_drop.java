package Keyboard.mouse.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop 
{
 public static void main(String[] args) 
 {
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/mouse-actions");
		
		WebElement Source = driver.findElement(By.id("drag-source"));
		
		WebElement Target = driver.findElement(By.id("drop-target"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", Source);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(Source, Target).perform();
		
		
		
		
}
}
