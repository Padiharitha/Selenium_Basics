package com.learning;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirfoxDriver {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	}

}
