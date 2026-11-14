package com.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Firefox_PrivateMode {

	public static void main(String[] args) 
	{
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("-private-window");
		
		WebDriver driver = new FirefoxDriver(options);
		driver.manage().window().maximize();
		
	}

}
