package WebElement_Interactions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multidropdownselect 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/drop-down");
		
		WebElement ele = driver.findElement(By.id("skills"));
		
		Select dropdown = new Select(ele);
		
		dropdown.selectByVisibleText("Java");
		dropdown.selectByVisibleText("Python");
		dropdown.selectByVisibleText("Selenium");
		
		//Get all the selected options.
		
		List<WebElement> selectedopt = dropdown.getAllSelectedOptions();
		for(WebElement Element : selectedopt)
		{
			System.out.println(Element.getText());
		}
	}
}
