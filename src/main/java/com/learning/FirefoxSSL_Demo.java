package com.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxSSL_Demo
{
	public static void main(String[] args) 
	{
		FirefoxOptions options = new FirefoxOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://expired.badssl.com/");
	}
}
