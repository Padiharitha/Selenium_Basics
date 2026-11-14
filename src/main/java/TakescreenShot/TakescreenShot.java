
package TakescreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.apache.commons.io.FileUtils;

public class TakescreenShot {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Typecasting WebDriver into TakesScreenshot
        TakesScreenshot sc = (TakesScreenshot) driver;

        // Capture screenshot
        File image = sc.getScreenshotAs(OutputType.FILE);

        // Save screenshot to the specified location
        File destination = new File("D:\\Projects\\Selenium_Basics\\Screenshots\\Image.png");

        FileUtils.copyFile(image, destination);

        System.out.println("Screenshot captured successfully!");

        driver.quit();
    }
}

