package com.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxHeadless {

	public static void main(String[] args) 
	{
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		String Title = driver.getTitle();
		System.out.println("The Title of the page:" + Title);
		System.out.println("The URL of the page:" + driver.getCurrentUrl());
	}

}
