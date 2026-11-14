package com.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadless {

	public static void main(String[] args) 
	{
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		String Title = driver.getTitle();
		System.out.println("The Title of the page:" + Title);
		System.out.println("The URL of the page:" + driver.getCurrentUrl());
		
	}

}
