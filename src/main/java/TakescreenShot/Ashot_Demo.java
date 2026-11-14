package TakescreenShot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class Ashot_Demo 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
         driver.get("https://www.facebook.com/");
         
         Thread.sleep(5000);
         
         Screenshot sc = new AShot().takeScreenshot(driver);
         
         File image = new File("D:\\Projects\\Selenium_Basics\\AshotImages\\Home.png");
         
         ImageIO.write(sc.getImage(), "png" , image);
	        
	}
}
