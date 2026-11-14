package com.learning;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromedownloadPath {

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		
		Map<String, Object> settings = new HashMap <String, Object>();
		settings.put("download.default_directory", "D:\\Projects\\Selenium_Basics\\src\\Resources");
		
		options.setExperimentalOption("prefs", settings);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://shelendrakumaracademy.com/web/download-file");
		
		WebElement ele = driver.findElement(By.id("download-sample-file"));
		ele.click();
		
	}

}
