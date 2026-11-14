package TakescreenShot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullpageScreenshot
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
        driver.get("https://www.facebook.com/privacy");
        
        Thread.sleep(2000);
        
        Screenshot sc = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        
        File image = new File("D:\\Projects\\Selenium_Basics\\AshotImages\\FullScreen.png");
        
        ImageIO.write(sc.getImage(), "png" , image);
	        
	}
}
