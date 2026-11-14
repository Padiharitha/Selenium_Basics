package WebElement_Interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_actions {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/checkbox");
		
		WebElement ele = driver.findElement(By.id("checkbox-python"));
		
		// status of checkbox before clicking on it.
		boolean statusbeforeClick = ele.isSelected();
		System.out.println("Status before clicking is:" + statusbeforeClick);
		
		//click/select the checkbox
		ele.click();
		
		//status of checkbox after clicking on it.
		boolean statusafterClick = ele.isSelected();
		System.out.println("Status after clicking is:" + statusafterClick);
	}

}
