package Common_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_information 
{
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/"); // Home Page
		
		String Title = driver.getTitle();
		System.out.println("Title of the page:" + Title);
		
		WebElement ele = driver.findElement(By.linkText("Text box"));
		ele.click();
		
		String Url = driver.getCurrentUrl();
		System.out.println("The currentUrl of the page is:" + Url);
		
		Thread.sleep(5000);
		driver.navigate().back(); //From textbox page to homepage.
		Thread.sleep(5000);
		driver.navigate().forward(); //From Homepage to textbox page.
		Thread.sleep(5000);
		driver.navigate().refresh();
		
	}
}
