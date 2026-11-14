package com.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver 
{
		public static WebDriver getDriver()
		{
			WebDriver driver = new ChromeDriver(); 
			return driver; 
		}
}

  // Here we can call this method getDriver(); in everyscript and utilize
//no need to create all the steps again.