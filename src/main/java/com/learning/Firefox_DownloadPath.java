package com.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox_DownloadPath 
{
public static void main(String[] args) 
{
	FirefoxOptions options = new FirefoxOptions();
	
	options.addPreference("browser.download.dir", "D:\\Projects\\Selenium_Basics\\src\\Resources");
	
	options.addPreference("browser.download.folderList", 2);
	
	WebDriver driver = new FirefoxDriver(options);
	
	driver.manage().window().maximize();
	driver.get("https://shelendrakumaracademy.com/web/download-file");
	
	WebElement ele = driver.findElement(By.id("download-sample-file"));
	ele.click();
	
	}
}
