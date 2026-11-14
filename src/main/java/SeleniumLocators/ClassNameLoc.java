package SeleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLoc {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/sign-up");
		
		List<WebElement> buttons = driver.findElements(By.className("signup-action-btn"));
		System.out.println(buttons.size());
		
		for(WebElement button : buttons)
		{
			System.out.println(button.getText());
		}
	}

}

/* Contains Xpath -   //input[contains(@id,"last-name")].
 * Starts-with -    //input[starts-with(@name,"email")].
 * Child -     //div[@id="username-field"]/child::input.
 * Parent -    //span[@id="newsletter"]/parent::div/parent::div
 * following-sibling -    //button[@id="clear-account-details-btn"]/following-sibling::button
 * preceding-sibling -    //button[@id="clear-account-details-btn"]/preceding-sibling::button
 * Text() -    //button[text()="Create Account"]
 * */


