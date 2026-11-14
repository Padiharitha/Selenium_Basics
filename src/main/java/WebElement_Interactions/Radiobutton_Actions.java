package WebElement_Interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_Actions
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/radio-button");
		
		WebElement ele = driver.findElement(By.id("radio-beginner"));
		
		//Check status of radiobutton before click.
		boolean statusbeforeClick = ele.isSelected();
		System.out.println("Status before clicking:" + statusbeforeClick);
		
		//click on the radiobutton
		ele.click();
		
		Thread.sleep(Duration.ofSeconds(5));
		
		//check status of radiobutton after click.
		boolean statusafterClick = ele.isSelected();
		System.out.println("Status after clicking:" + statusafterClick);
		
		//driver.quit();
	}
}
