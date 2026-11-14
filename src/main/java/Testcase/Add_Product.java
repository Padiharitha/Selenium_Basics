package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Product
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000)); 
	
	driver.get("https://www.amazon.in/"); 
	
	Thread.sleep(5000); 
	
	String Title = driver .getTitle(); 
	System.out.println(Title); 
	
	WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox")); 
	searchbox.click(); 
	
	searchbox.sendKeys("Mobile"); 
	
	WebElement searchicon = driver.findElement(By.id("nav-search-submit-button")); 
	searchicon.click(); 
	
	Thread.sleep(4000); 
	
	JavascriptExecutor js = (JavascriptExecutor)driver; 
	js.executeScript("window.scrollBy(0,600)"); 
	
	WebElement addtocart = driver.findElement(By.xpath("(//input[@name=\"submit.addToCart\"])[1]")); 
	addtocart.click(); 
	
	Thread.sleep(5000); 
	
	WebElement cart = driver.findElement(By.xpath("(//span[contains(text(),\"1 in cart\")])[1]")); 
	if(cart.isDisplayed()) 
	{
		System.out.println("Product was added to cart"); 
	}
	else 
	{
		System.out.println("Product was not added to cart"); 
	} 
	
	Thread.sleep(5000); 
	driver.findElement(By.xpath("(//a[contains(text(),\"Go to Cart\")])[1]")).click(); 
	
	WebElement count = driver.findElement(By.xpath("(//span[@class=\"a-icon a-icon-small-trash\"]/../..//span[text()=\"1\"])[1]"));   
	count.isDisplayed(); 
	System.out.println(count.getText()); 
	
	//driver.quit(); 
	
}
}
