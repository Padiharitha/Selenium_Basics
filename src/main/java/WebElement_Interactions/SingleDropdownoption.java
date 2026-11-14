package WebElement_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropdownoption 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/drop-down");
		
		WebElement ele = driver.findElement(By.id("jobTitle"));
		
		//Creating the Select class
		Select dropdown = new Select(ele);
		
		//dropdown.selectByVisibleText("Engineering");
		
		
		//dropdown.selectByValue("Customer Service");
		
		dropdown.selectByIndex(5);
		
		WebElement selectedOption = dropdown.getFirstSelectedOption();
		String text = selectedOption.getText();
		System.out.println("Selected option is:" + text);
	}
}
