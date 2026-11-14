package WebElement_Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox_Actions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/text-box");
		
		//Sendkeys method.
		String Email = "harithahari0808@gmail.com";
		WebElement ele = driver.findElement(By.name("user_email"));
		ele.sendKeys(Email);
		
		//get the value of the attribute.
		String emailVal = ele.getAttribute("value");
		System.out.println(emailVal);
		
		Thread.sleep(Duration.ofSeconds(5));
		//clear the text.
		ele.clear();
		
		if(Email.equals(emailVal))
		{
			System.out.println("Input text matches Attribute text");
		}
		else
		{
			System.out.println("Input text and Attribute text doesnot match");
		}
		
	}

}
